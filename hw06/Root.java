//hw06 estimate the root with bisection method
//jic318
//import 
import java.util.Scanner;
//define a class
public class Root {
    //define a method
    public static void main(String[] args) {
        //begin
        Scanner S;
        S= new Scanner( System.in );
        System.out.print("Input a number-");
        if (S.hasNextDouble()) {
            double N=S.nextDouble();
            if (N>=0) {
                
                double  i, mid, high, low, midSquare;
                high=1+N;
                low=0;
                i=high-low;
                mid=(high+low)/2;
                midSquare=mid*mid;
                while (i>=0.0000001*(1+N)) {
                    mid=(high+low)/2;
                    midSquare=mid*mid;
                    if (midSquare<N) {
                        low=mid;
                    }//when mid^2 <= N, mid becomes low
                    else if (midSquare>N) {
                        high=mid;
                    }//when mid^2 >= N, mid becomes high
                    i=high-low;
                }//end of loop
                System.out.println("The root is "+mid);
            }//end of >=0 test
            else {
                System.out.println("Error");
                return;
            }//when there is not a postitve number or 0
        }//end of double test
        else {
            System.out.println("Error!");
            return;
        }//when there is not a double
    }//end of method
}//end of class