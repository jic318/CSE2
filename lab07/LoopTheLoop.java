//use loop to print *
//jic318
//import
import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String[] args) {
        Scanner S;
        S= new Scanner (System.in);
        System.out.print("Input an int");
        if (S.hasNextInt()) {
            int in=S.nextInt();
            if (in<=15&&in>=1) {
                int i=0, i1;
                String stars="*";
                i1=in;
                while (i1>0) {
                    i1--;
                    System.out.print("*");
                }
                
                
                while (i<in) {
                    System.out.println(stars);
                    i++;
                    stars=stars+"*";
                }
                
            }
            else {
                System.out.println("Error");
                return;
            }
        }
        else {
            System.out.println("Error");
            return;
        }
    }
}