import java.io.*;
public class TestCase3 { 
public static void main(String[] args){
try{
PrintStream o = new PrintStream(new File("StudentAnswer3.txt"));
PrintStream console = System.out;

// Assign o to output stream
System.setOut(o);
}
catch (FileNotFoundException ex)  
{
// insert code to run when exception occurs
}

MMBurgersInterface mm = new MMBurgers();
System.out.println("--Started simulation--");
try{
mm.setK(20);
mm.setM(35);
}
catch(IllegalNumberException e){
System.out.println("Exception");
}
try{
mm.arriveCustomer(1, 0, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(2, 0, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(3, 0, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(1));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(4, 2, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(5, 2, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(6, 2, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(2));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(7, 3, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(8, 3, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(9, 4, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(10, 5, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(5));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(11, 7, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(12, 9, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(13, 9, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(14, 9, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(9));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(15, 10, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(16, 10, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(17, 10, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(18, 10, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(19, 10, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(10));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(20, 12, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(21, 12, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(12));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(285, 13));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(14));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(22, 15, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(23, 16, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(24, 16, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(16));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(17));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(25, 18, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(26, 20, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(27, 21, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(28, 21, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(29, 21, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(30, 22, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(31, 23, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(32, 25, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(33, 25, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(34, 25, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(35, 25, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(25));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(36, 26, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(37, 26, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(26));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(38, 27, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(27));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(28));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(39, 29, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(40, 29, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(41, 29, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(42, 29, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(43, 29, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(44, 30, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(45, 30, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(190, 30));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(46, 31, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(31));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(32));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(47, 33, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(48, 33, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(49, 34, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(34));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(50, 35, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(35));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(36));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(51, 37, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(52, 37, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(53, 38, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(54, 38, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(55, 38, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(56, 39, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(57, 39, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(58, 41, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(51, 41));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(59, 42, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(60, 42, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(42));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(43));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(61, 45, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(62, 45, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(45));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(63, 46, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(64, 48, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(65, 48, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(66, 49, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(67, 50, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(68, 50, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(69, 50, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(112, 50));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(70, 51, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(71, 51, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(72, 52, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(73, 53, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(74, 53, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(75, 54, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(54));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(76, 55, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(77, 55, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(55));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(78, 56, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(79, 56, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(80, 56, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(56));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(81, 61, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(82, 65, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(83, 65, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(214, 65));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(84, 66, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(85, 66, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(67));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(68));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(86, 69, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(87, 69, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(88, 70, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(239, 70));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(89, 71, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(90, 71, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(91, 74, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(92, 74, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(93, 74, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(76);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(94, 76, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(95, 77, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(96, 77, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(97, 77, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(98, 78, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(26, 78));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(99, 79, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(104, 79));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(100, 80, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(101, 80, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(81));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(102, 82, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(103, 83, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(104, 84, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(84));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(105, 85, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(106, 85, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(107, 86, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(108, 86, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(109, 86, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(110, 87, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(111, 87, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(87));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(112, 88, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(291, 88));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(89));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(90));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(113, 91, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(114, 92, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(115, 92, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(116, 93, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(93));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(117, 94, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(118, 94, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(119, 95, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(120, 96, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(121, 96, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(122, 96, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(292, 97));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(123, 98, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(98));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(99));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(124, 100, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(100));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(125, 101, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(126, 101, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(127, 101, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(128, 102, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(129, 103, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(130, 103, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(42, 103));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(2, 104));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(105));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(131, 106, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(132, 106, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(133, 106, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(134, 108, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(135, 108, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(136, 109, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(137, 110, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(110));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(138, 111, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(111));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(112));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(181, 113));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(139, 114, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(140, 114, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(141, 115, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(142, 115, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(115));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(143, 117, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(144, 117, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(145, 119, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(126);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(146, 126, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(147, 126, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(148, 126, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(149, 127, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(150, 127, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(151, 127, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(152, 127, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(128));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(129));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(153, 132, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(154, 133, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(155, 133, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(156, 133, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(133));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(157, 134, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(158, 135, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(159, 135, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(136));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(160, 137, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(161, 138, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(85, 138));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(162, 139, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(163, 140, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(164, 140, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(165, 142, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(166, 142, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(94, 142));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(167, 143, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(168, 143, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(143));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(169, 144, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(170, 144, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(144));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(171, 145, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(145));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(292, 147));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(148));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(172, 149, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(173, 149, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(174, 149, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(175, 150, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(151));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(176, 152, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(177, 154, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(167, 154));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(178, 155, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(179, 155, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(180, 156, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(181, 156, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(228, 157));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(182, 158, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(183, 159, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(159));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(184, 160, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(185, 160, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(160));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(186, 162, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(187, 162, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(251, 162));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(188, 163, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(189, 163, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(190, 163, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(191, 164, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(192, 164, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(193, 165, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(194, 166, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(195, 166, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(166));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(196, 167, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(197, 167, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(167));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(137, 170));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(198, 171, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(199, 172, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(200, 173, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(201, 173, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(202, 173, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(203, 173, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(173));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(204, 174, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(205, 174, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(206, 175, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(207, 176, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(267, 178));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(208, 179, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(209, 179, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(210, 179, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(211, 180, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(212, 182, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(213, 182, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(214, 182));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(214, 183, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(215, 183, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(211, 183));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(62, 184));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(216, 185, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(185));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(217, 186, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(186));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(218, 187, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(219, 188, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(143, 188));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(189));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(220, 191, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(221, 191, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(222, 191, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(191));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(223, 192, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(224, 193, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(225, 193, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(199);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(226, 199, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(227, 201, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(228, 202, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(229, 202, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(202));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(230, 204, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(231, 204, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(232, 204, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(204));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(233, 206, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(234, 206, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(100, 206));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(235, 207, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(236, 207, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(237, 207, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(272, 208));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(238, 209, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(239, 210, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(240, 210, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(241, 210, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(210));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(242, 211, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(218, 211));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(243, 213, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(244, 213, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(3, 213));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(245, 214, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(246, 214, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(247, 215, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(248, 216, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(249, 217, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(250, 217, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(251, 218, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(252, 218, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(123, 218));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(253, 219, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(254, 220, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(255, 221, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(243, 221));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(256, 223, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(257, 223, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(258, 223, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(259, 223, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(260, 224, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(261, 224, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(224));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(262, 226, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(263, 226, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(226));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(264, 227, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
mm.arriveCustomer(265, 228, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(228));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(229));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(266, 231, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(267, 231, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(231));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(268, 232, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(269, 232, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(270, 232, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(232));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(271, 233, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(272, 234, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(234));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(273, 235, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(274, 235, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(275, 236, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(9, 237));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(276, 238, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(238));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(277, 239, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(278, 240, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(240));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(55, 241));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(279, 242, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(280, 242, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(242));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(281, 243, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(289, 243));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(244));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(282, 246, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(283, 246, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(284, 246, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(139, 247));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(248));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(285, 249, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(286, 249, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(287, 249, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(288, 250, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(289, 250, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(290, 250, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(257);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(259));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(207, 260));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(261));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(263));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(266));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(267));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(269));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(270));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(277, 274));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(275));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(148, 277));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(279));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(280));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(281));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(154, 282));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(283));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(284));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(286));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(287));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(295);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(295));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(11, 297));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(299));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(159, 301));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(311);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(258, 311));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(156, 313));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(319));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(321));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(78, 323));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(172, 327));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(330);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(333);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(13, 333));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(334));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(336));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(339));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(342));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(343));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(344));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(351);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(353));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(139, 354));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(355));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(356));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(229, 358));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(364));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(365));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(366));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(368));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(369));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(372));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(374));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(375));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(376));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(377));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(382));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(383));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(234, 384));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(385));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(176, 386));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(211, 387));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(389));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(391));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(393));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(394));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(397));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(402));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(405));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(407));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(409));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(410));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(415));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(416));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(426);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(79, 426));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(427));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleState(430));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(431));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(432));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(433));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(434));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(436));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(437));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(439));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(178, 441));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(444));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(105, 445));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(293, 446));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(447));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(450));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(452));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(114, 453));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(454));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(457));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(460));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(463));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(465));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(466));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(171, 467));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(468));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(469));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(470));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(471));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(3, 473));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(475));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(476));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(477));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(479));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(481);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(483));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(132, 485));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(31, 486));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(488));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(500);
System.out.println("--End of simulation--");}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerWaitTime(139));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(158));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(262));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(294));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(268));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(167));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(177));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(224));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(1));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(263));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(12));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(146));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(103));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(99));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(245));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(145));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(20));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(235));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(239));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(260));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(285));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(236));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(131));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(64));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(163));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(282));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(186));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(288));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(27));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(246));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(216));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(47));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(7));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(128));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(281));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(200));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(132));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(100));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(2));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(75));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(8));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(214));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(225));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(3));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(289));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(240));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(199));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(159));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(180));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(32));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(65));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(44));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(178));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(194));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(67));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(256));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(95));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(89));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(207));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(290));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(63));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(33));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(292));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(251));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(275));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(125));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(184));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(26));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(10));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(88));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(271));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(141));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(230));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(228));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(39));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(254));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(82));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(49));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(196));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(154));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(238));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(195));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(193));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(112));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(40));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(257));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(56));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(90));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(249));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(9));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(15));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(16));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(72));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(204));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(84));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(165));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(101));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(279));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(116));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(278));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(171));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(269));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(250));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(17));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(248));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(220));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(283));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(208));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(179));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(197));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(147));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(212));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(191));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(266));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(143));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(188));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(138));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(119));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(258));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(160));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(61));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(73));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(120));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(175));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(91));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(4));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(50));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(53));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(86));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(105));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(107));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(229));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(117));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(215));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(31));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(108));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(226));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(182));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(13));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(18));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(87));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(58));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(54));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(172));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(92));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(114));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(126));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(164));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(48));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(295));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(41));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(296));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(218));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(81));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(277));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(21));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(98));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(62));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(253));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(155));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(217));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(25));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(96));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(129));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(243));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(104));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(94));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(133));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(38));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(34));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(168));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(270));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(291));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(297));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(109));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(247));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(231));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(286));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(237));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(110));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(46));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(293));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(42));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(209));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(149));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(136));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(14));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(97));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(106));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(219));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(206));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(265));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(57));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(273));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(59));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(185));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(169));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(121));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(233));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(287));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(189));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(30));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(23));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(234));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(28));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(68));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(221));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(78));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(22));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(123));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(5));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(35));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(124));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(166));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(153));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(93));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(140));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(274));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(298));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(227));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(173));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(213));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(201));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(76));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(134));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(29));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(118));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(79));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(85));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(174));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(299));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(60));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(137));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(66));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(113));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(43));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(24));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(241));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(255));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(252));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(210));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(11));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(267));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(157));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(142));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(223));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(202));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(70));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(45));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(150));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(127));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(83));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(74));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(192));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(19));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(280));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(232));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(77));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(183));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(51));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(36));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(69));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(144));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(122));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(115));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(162));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(242));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(55));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(37));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(176));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(300));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(52));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(170));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(130));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(190));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(205));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(135));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(261));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(156));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(148));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(203));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(272));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(264));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(102));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(244));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(151));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(152));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(187));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(198));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(259));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(71));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(161));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(181));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(276));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(80));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(6));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(111));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(211));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(284));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(222));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(String.format("%.2f", mm.avgWaitTime()));
}
}
