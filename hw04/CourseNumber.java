//hw04-CourseNumber 
//input the course number and show which course it is
//jic318
//import
import java.util.Scanner;
//define a class
public class CourseNumber {
    //define a method
    public static void main(String[] args) {
        //begin
        Scanner S;
        S=new Scanner( System.in );
        System.out.print("Enter a six digit number giving the course semester- ");
        if (S.hasNextInt()) {
            int number=S.nextInt();
            if (number<=201440&&number>=186510) {
                int CN, YN;
                YN=(int)number/100;//number of years
                CN=number-YN*100;//number of semester
                if (CN==10) {
                    System.out.println("The course was offered in the spring semester of "+YN);
                }//Spring Semester
                else if (CN==20) {
                    System.out.println("The course was offered in the summer 1 semester of "+YN);
                }//Summer 1
                else if (CN==30) {
                    System.out.println("The course was offered in the summer 2 semester of "+YN);
                }//Summer 2
                else if (CN==40) {
                    System.out.println("The course was offered in the fall semester of "+YN);
                }//Fall
                else {
                    System.out.println(CN+" is not a legitimate semester");
                }//end of semester test else
            }//end of range test
            else {
                System.out.println("The number was outside the range [186510,201440]");
                return;
            }//end of range test else
        }//end of int test
        else {
            System.out.println("Error");
            return;
        }//end of int test else
    }//end of method
}//end of class