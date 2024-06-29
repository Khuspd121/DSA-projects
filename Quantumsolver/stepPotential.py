import numpy as np
import matplotlib.pyplot as plt
from scipy.linalg import eigh_tridiagonal

class PiecewiseConstantPotentialSolver:
    def __init__(self, potential_regions, num_points=1000):
        self.potential_regions = potential_regions
        self.num_points = num_points
        self.x, self.V = self.potential()

    def potential(self):
        x = np.linspace(self.potential_regions[0][1], self.potential_regions[-1][2], self.num_points)
        V = np.zeros_like(x)

        for V_val, x_start, x_end in self.potential_regions:
            indices = np.where((x >= x_start) & (x <= x_end))
            V[indices] = V_val

        return x, V

    def solve(self, num_states=5):
        dx = self.x[1] - self.x[0]
        N = len(self.x)

        # Main diagonal of the Hamiltonian matrix
        main_diag = 1 / dx**2 + self.V
        # Off-diagonal elements
        off_diag = -1 / (2 * dx**2) * np.ones(N-1)

        # Solve the tridiagonal matrix eigenvalue problem
        energies, wave_functions = eigh_tridiagonal(main_diag, off_diag)

        # Select the first num_states states and normalize wave functions
        wave_functions = wave_functions[:, :num_states]
        for i in range(num_states):
            norm = np.sqrt(np.trapz(np.abs(wave_functions[:, i])**2, self.x))
            wave_functions[:, i] /= norm

        return energies[:num_states], wave_functions[:, :num_states]

    def plot_potential(self):
        """
        Plot the potential.
        """
        plt.plot(self.x, self.V, label='Potential')
        plt.xlabel('Position (x)')
        plt.ylabel('Potential (V)')
        plt.title('Piecewise Constant Potential')
        plt.legend()
        plt.grid(True)
        plt.show()

    def plot_wave_functions(self, energies, wave_functions):
        """
        Plot the wave functions along with the potential.

        :param energies: Array of energy levels.
        :param wave_functions: Array of wave functions corresponding to the energy levels.
        """
        plt.plot(self.x, self.V, label='Potential', color='black')
        for i, (energy, wave_function) in enumerate(zip(energies, wave_functions.T)):
            plt.plot(self.x, wave_function + energy, label=f'ψ{i+1} (E = {energy:.2f})')

        plt.xlabel('Position (x)')
        plt.ylabel('Energy and Wave Functions')
        plt.title('Wave Functions in Piecewise Constant Potential')
        plt.legend()
        plt.grid(True)
        plt.show()

# Example usage
potential_regions = [(0, 0, 1), (5, 1, 2), (0, 2, 3)]
solver = PiecewiseConstantPotentialSolver(potential_regions)

# Plot the potential
solver.plot_potential()

# Solve the Schrödinger equation
energies, wave_functions = solver.solve(num_states=5)

# Plot the wave functions
solver.plot_wave_functions(energies, wave_functions)
