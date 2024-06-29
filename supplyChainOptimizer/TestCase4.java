import java.io.*;
public class TestCase4 { 
public static void main(String[] args){


        try{
            PrintStream o = new PrintStream(new File("StudentAnswer4.txt"));
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
mm.setK(10);
mm.setM(20);
}
catch(IllegalNumberException e){
System.out.println("Exception");
}
try{
mm.arriveCustomer(1, 0, 14);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(0));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(2, 1, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(9, 6));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(3, 7, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(4, 9, 13);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(10));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(5, 11, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(6, 12, 13);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(7, 12, 9);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerState(1, 15));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(15, 16));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(15, 17));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(8, 18, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(20));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(21));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(23));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(10, 25));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(9, 26, 15);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(27));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(16, 28));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(29, 29));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(10, 31, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(31));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(32));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(11, 33, 9);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(21, 33));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(34));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(24, 36));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(23, 38));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(12, 39, 14);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(39));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(13, 40, 15);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(40));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(14, 41, 9);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(41));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(15, 42, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(16, 42, 13);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(43));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(17, 45, 10);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(21, 48));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(18, 51, 8);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(53));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(54));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(19, 55, 2);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(20, 56, 10);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(56));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(64);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(64));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(21, 66, 6);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(67));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(69));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(22, 70, 10);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(23, 70, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(24, 71, 5);}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.griddleWait(76));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(25, 78, 3);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(26, 78, 4);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(13, 78));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(27, 80, 1);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.arriveCustomer(28, 81, 10);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(81));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(82));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(88);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(96);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(96));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(97));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(30, 98));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(99));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(15, 101));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(102));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(7, 103));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(105));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(17, 113));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(6, 115));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(15, 116));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(119));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(31, 121));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(122));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(125));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(126));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(127));}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerState(32, 130));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(14, 132));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(20, 134));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(135));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(136));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(138));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(142));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleWait(143));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(14, 145));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(147));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerState(22, 151));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(152));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(153));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(155));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(161));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(162));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(163));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(169);}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.griddleState(169));}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
mm.advanceTime(180);
System.out.println("--End of simulation--");}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(mm.isEmpty());
try{
System.out.println(mm.customerWaitTime(8));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(12));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(6));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(4));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(30));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(15));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(29));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(24));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(7));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(17));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(19));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(13));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(25));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(28));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(9));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(22));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(33));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(20));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(21));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(11));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(3));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(23));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(2));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(5));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(18));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(32));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(34));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(27));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(1));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(26));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(35));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(16));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(10));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(14));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
try{
System.out.println(mm.customerWaitTime(31));
}
catch(IllegalNumberException e){
System.out.println("Exception");}
System.out.println(String.format("%.2f",mm.avgWaitTime()));
}
}
