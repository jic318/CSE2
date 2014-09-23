//hw04-Month
//input a month, and show how many days the month have
//jic318
//import
import java.util.Scanner;
//define a class
public class Month {
    //define a method
    public static void main(String[] args) {
        //begin
        Scanner S;
        S=new Scanner( System.in );
        System.out.print("Enter an int giving the number of the month (1-12) ");
        if (S.hasNextInt()) {
            int month=S.nextInt();
            if (month<=12&&month>=1) {
                if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
                    System.out.println("The month has 31 days");
                }//months with 31 days
                else if (month==4||month==6||month==9||month==11) {
                    System.out.println("The month has 30 days");
                }//months with 30 days
                else if (month==2) {
                    System.out.print("Enter an int giving the year ");
                    if (S.hasNextInt()) {
                        int year=S.nextInt();
                        int d;
                        d=year%4;
                        if (d==0) {
                           if (year%100==0&&year%400!=0) {
                               System.out.println("The month has 28 days");
                           }//end of leap year test 2
                           else {
                               System.out.println("The month has 29 days");
                           }//end of leap year test 2 else
                        }//end of leap year test1
                        else {
                            System.out.println("The month has 28 days");
                        }//end of leap year test
                    }//end of int test of year
                    else {
                        System.out.println("Error");
                        return;
                    }//end of int test of year else
                }//Feburary
            }//end of 1-12 test
            else {
               System.out.println("Error");
               return;
            }//end of 1-12 test else
        }//end of int test
        else {
            System.out.println("Error");
            return;
        }//end of int test else
    }//end of method
}//end of class