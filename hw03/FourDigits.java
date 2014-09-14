//hw03
//jic318
//import
import java.util.Scanner;
//define a class
public class FourDigits{
    //define a method
    public static void main(String[] args){
        //begin
        Scanner myScanner;
        myScanner=new Scanner( System.in );
        System.out.print("Enter a double and I print the four digits to the right of the decimal point- ");
        double input=myScanner.nextDouble();//input a number with four digits to the right of the decimal point
        int digit, output2;
        double output1;
        digit=(int) input;//cast the number to integer
        output1=(input-(double)digit)*10000;//find the four digits
        output2=(int)output1;//cast the output to interger 
        System.out.print("The four digits are "+output2+".");
    }
}