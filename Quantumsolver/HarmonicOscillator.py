import numpy as np
import matplotlib.pyplot as plt
from scipy.linalg import eigh_tridiagonal
from scipy.special import hermite

class HarmonicOscillatorSolver:
    def __init__(self, x_min, x_max, num_points=1000, mass=1.0, omega=1.0):
        self.x_min = x_min
        self.x_max = x_max
        self.num_points = num_points
        self.mass = mass
        self.omega = omega
        self.x, self.V = self._build_potential()

    def _build_potential(self):
        x = np.linspace(self.x_min, self.x_max, self.num_points)
        V = 0.5 * self.mass * self.omega**2 * x**2
        return x, V

    def solve(self, num_states=5):
        """
        Solve for the energy levels and wave functions.

        :param num_states: Number of eigenstates to find.
        :return: Tuple (energies, wave_functions) where energies is an array of energy levels and wave_functions is an
                 array of corresponding wave functions.
        """
        dx = self.x[1] - self.x[0]
        N = len(self.x)

        # Main diagonal of the Hamiltonian matrix
        main_diag = 1 / dx**2 + self.V / (2 * self.mass)
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
        plt.plot(self.x, self.V, label='Potential')
        plt.xlabel('Position (x)')
        plt.ylabel('Potential (V)')
        plt.title('Harmonic Oscillator Potential')
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
        plt.title('Wave Functions in Harmonic Oscillator Potential')
        plt.legend()
        plt.grid(True)
        plt.show()

    def plot_comparison(self, num_states=3):
        """
        Plot the numerical wave functions and compare with the analytical solutions.

        :param num_states: Number of states to compare.
        """
        energies, wave_functions = self.solve(num_states=num_states)

        plt.figure(figsize=(12, 8))

        # Plot numerical solutions
        plt.plot(self.x, self.V, label='Potential', color='black')
        for i, (energy, wave_function) in enumerate(zip(energies, wave_functions.T)):
            plt.plot(self.x, wave_function + energy, label=f'Numerical ψ{i} (E = {energy:.2f})')

        # Plot analytical solutions for comparison
        for n in range(num_states):
            # Analytical solution: Hermite polynomial * Gaussian
            H_n = hermite(n)
            psi_n = (1.0 / np.sqrt(2**n * np.math.factorial(n))) * (self.mass * self.omega / np.pi)**0.25
            psi_n *= np.exp(-0.5 * self.mass * self.omega * self.x**2) * H_n(np.sqrt(self.mass * self.omega) * self.x)
            psi_n /= np.sqrt(np.trapz(np.abs(psi_n)**2, self.x))  # Normalize
            plt.plot(self.x, psi_n + (n + 0.5) * self.omega, '--', label=f'Analytical ψ{n} (E = {(n + 0.5) * self.omega:.2f})')

        plt.xlabel('Position (x)')
        plt.ylabel('Energy and Wave Functions')
        plt.title('Comparison of Numerical and Analytical Wave Functions')
        plt.legend()
        plt.grid(True)
        plt.show()

# Example usage
x_min, x_max = -5, 5  # Range for x
num_points = 1000  # Number of discretization points
mass = 1.0  # Mass of the particle
omega = 1.0  # Angular frequency of the oscillator

solver = HarmonicOscillatorSolver(x_min, x_max, num_points, mass, omega)

# Plot the potential
solver.plot_potential()

# Plot the wave functions and compare with analytical solutions
solver.plot_comparison(num_states=5)
