//hw03
//jic318
//import
import java.util.Scanner;
//define a class
public class Root{
    //define a method
    public static void main(String[] args) {
        //begin
        Scanner myScanner;
        myScanner=new Scanner( System.in );
        System.out.print("Enter a double, and I print the cube root- ");
        double input=myScanner.nextDouble(); //input the number
        //Calculation
        double Guess, output;
        Guess=input/3; //first estimate
        Guess=(Guess*Guess*Guess+input)/(3*Guess*Guess); //fist substitution
        Guess=(2*Guess*Guess*Guess+input)/(3*Guess*Guess);//substitution
        Guess=(2*Guess*Guess*Guess+input)/(3*Guess*Guess);//substitution
        Guess=(2*Guess*Guess*Guess+input)/(3*Guess*Guess);//substitution
        Guess=(2*Guess*Guess*Guess+input)/(3*Guess*Guess);//substitution
        output=Guess*Guess*Guess;
        System.out.print("The cube root is "+Guess+":"+Guess+"*"+Guess+"*"+Guess+"="+output+".");
    }
}