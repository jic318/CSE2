//Counting the total cost of Big Macs and fries. Using selection
//jic318
//import Scanner
import java.util.Scanner;
//define a class
public class BigMacAgain {
    //define a method
    public static void main(String[] args) {
        //Begin
        Scanner SC;
        SC=new Scanner( System.in );
        System.out.print("Enter the number of BigMacs: ");
        if(SC.hasNextInt()) {
            int nBigMacs=SC.nextInt();
            if(nBigMacs>=0) {
                double costBigMac;
                costBigMac=nBigMacs*2.22;
                System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs+"x2.22="+costBigMac);
                System.out.print("Do you want an order of fries?(Y/y/N/n)");
                String Ji=SC.next();
                if(Ji.equals("Y")||Ji.equals("y")) {
                    double totalCost;
                    totalCost=costBigMac+2.15;
                    System.out.println("You ordered fries at a cost of $2.15");
                    System.out.println("The total cost of the meal is "+totalCost);
                }//end of Yes test
                else if(Ji.equals("N")||Ji.equals("n")) {
                    System.out.println("The total cost of the meal is $"+costBigMac);
                }//end of No test
                else {
                    System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
                    return;
                }
            }//end of >0 test
            else {
                System.out.println("You did not enter a proper integer");
                return;
            }
           
        
       
        
        
        }//end of interger test
        else {
            System.out.println("You did not enter an integer");
            return;
        }
    }//end of method
}//end of class