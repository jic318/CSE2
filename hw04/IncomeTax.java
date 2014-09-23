//hw04-IncomeTax
//input the income, and calculate the tax that has to be paid
//jic318
//import
import java.util.Scanner;
//define a class
public class IncomeTax {
    //define a method
    public static void main(String[] args) {
        //begin
        Scanner S;
        S=new Scanner( System.in );
        System.out.print("Enter an int giving the number of thousands- ");
        if(S.hasNextInt()) {
            int thousands;
            thousands=S.nextInt();
            if(thousands>0) {
                double tax, income;
                income=thousands*1000;
                if (thousands<20) {
                    tax=income*0.05;
                    System.out.println("The tax rate on $"+(int)income+"is 5%, and the tax is $"+(int)tax);
                }//when income<20
                else if (thousands>=20&&thousands<40) {
                    tax=income*0.07;
                    System.out.println("The tax rate on $"+(int)income+"is 7%, and the tax is $"+(int)tax);
                }//when 20<=income<40
                else if (thousands>=40&&thousands<78) {
                    tax=income*0.12;
                    System.out.println("The tax rate on $"+(int)income+"is 12%, and the tax is $"+(int)tax);
                }//when 40<=income<78
                else if (thousands>=78) {
                    tax=income*0.14;
                    System.out.println("The tax rate on $"+(int)income+"is 14%, and the tax is $"+(int)tax);
                }//when income>=78
            }//end of positive test
            else {
                System.out.println("You did not enter a positive int.");
                return;
            }//end of positive test else
        }//end of int test
        else {
            System.out.println("You did not enter an int.");
            return;
        }//end of int test else
            
    }//end of method
}//end of class