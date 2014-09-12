//lab03-BigMac
//jic318
//import
import java.util.Scanner;
//define a class
public class BigMac {
    //define a method
    public static void main(String[] args) {
        //Begin
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("Enter the number of Big Macs (an integer >0: " );
        int nBigMacs=myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac "+"a double (in the form xx.xx: ");
        double bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (in a form xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100;
        double cost$;
        int dollars, dimes, pennies;
        cost$=nBigMacs*bigMac$*(1+taxRate);
        dollars=(int)cost$;
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.print("The total cost of "+nBigMacs+" Big Macs, at $"+bigMac$+" per Big Mac, with a "+"sales tax of "+(int)(taxRate*100)+"%, is $"+dollars+dimes+pennies);
        
    } 
}