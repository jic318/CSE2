//hw04-TimePadding
//input the seconds, and show the time
//jic318
//import
import java.util.Scanner;
//define a class
public class TimePadding {
    //define a mehtod
    public static void main(String[] args) {
        //begin
        Scanner S;
        S=new Scanner( System.in );
        System.out.print("Enter the time in seconds: ");
        if (S.hasNextInt()) {
            int sec=S.nextInt();
            int R1, R2, hr, min, sec1;
            if (sec<=86400&&sec>=0) {
            if (sec<3600) {
                sec1=sec%60;
                min=(sec-sec1)/60;
                if (min<10&&sec1>=10) {
                    System.out.println("The time is 00:0"+min+":0"+sec1);
                }//min<10
                else if (sec1<10&&min>=10) {
                    System.out.println("The time is 00:"+min+":"+"0"+sec1);
                }//sec<10
                else if (sec1<10&&min<10) {
                    System.out.println("The time is 00:0"+min+":"+"0"+sec1);
                }//both <10
                else {
                    System.out.println("The time is 00:"+min+":"+sec1);
                }//without 0
            }//1st hr
            else {
                R1=sec%3600;
                R2=R1%60;
                hr=(sec-R1)/3600;
                min=(R1-R2)/60;
                sec1=R2;
                if (hr<10&&min>=10&&sec1>=10) {
                    System.out.println("The time is 0"+hr+":"+min+":"+sec1);
                }//hr<10, min&sec>=10
                else if (hr<10&&min<10&&sec1>=10) {
                    System.out.println("The time is 0"+hr+":0"+min+":"+sec1);
                }//hr<10, min<10, sec>=10
                else if (hr<10&&min<10&&sec1<10) {
                    System.out.println("The time is 0"+hr+":0"+min+":0"+sec1);
                }//all <10
                else if (hr<10&&min>=10&&sec1<10) {
                    System.out.println("The time is 0"+hr+":"+min+":0"+sec1);
                }//hr<10, min>=10, sec<10
                else if (hr>=10&&min<10&&sec1>=10) {
                    System.out.println("The time is "+hr+":0"+min+":0"+sec1);
                }//hr>=10, min<10, sec>=10
                else if (hr>=10&&sec1<10&&min>=10) {
                    System.out.println("The time is "+hr+":"+min+":"+"0"+sec1);
                }//hr>=10, min>=10, sec<10
                else if (hr>=10&&sec1<10&&min<10) {
                    System.out.println("The time is "+hr+":0"+min+":"+"0"+sec1);
                }//hr>=0, min<10, sec<10
                else {
                    System.out.println("The time is "+hr+":"+min+":"+sec1);
                }//without 0
            }//rest hrs
            }//end of range test
            else {
                System.out.println("Error");
                return;
            }//end of range test else
        }//end of int test
        else {
            System.out.println("Error");
            return;
        }//end of int test else
    }//end of method
}//end of class