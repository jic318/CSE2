//hw07  print the number stacks by using for and while 
//jic 318
//import 
import java.util.Scanner;
//define a class
public class NumberStack {
    //define a method
    public static void main(String[] args) {
        //begin
        Scanner S;
        S=new Scanner(System.in);
        System.out.print("Input a number between 1 and 9 - ");
        if (S.hasNextInt()) {
            int input=S.nextInt();
            if (input<=9&&input>=1) {
                //loop for
                int i1, i2, i3, len;
                String num="", b="";
                for (i1=1; i1<=input; i1++) {
                    len=2*i1-1;
                    num="";
                    b="";
                    for (i3=0; i3<len; i3++) {
                            num+=i1;
                            b=b+"-";
                    }//prepare the numbers
                    for (i2=0; i2<i1; i2++) {
                        
                        System.out.println(num);
                    }//print the numbers
                    System.out.println(b);
                }//end of fpr loop
                //loop while
                int i11=1, i22=0, i33=0, len2;
                while (i11<=input) {
                    String num2="", b2="";
                    len2=2*i11-1;
                    i22=0;
                    i33=0;
                    while (i22<len2) {
                        num2+=i11;
                        b2+="-";
                        i22++;
                    }//prepare the numbers and dividers
                    while (i33<i11) {
                        System.out.println(num2);
                        i33++;
                    }//print the numbers
                    System.out.println(b2);
                    i11++;
                }//end of while loop
                //loop do while
                int i111, i222, i333, len3;
                i111=1;
                do {
                    i222=0;
                    i333=0;
                    String num3="", b3="";
                    len3=2*i111-1;
                    do {
                        num3+=i111;
                        b3+="-";
                        i222++;
                    } while(i222<len3);//prepare the numbers and dividers
                    do {
                        System.out.println(num3);
                        i333++;
                    } while(i333<i111);//print the numbers
                    System.out.println(b3);
                    i111++;
                } while (i111<=input);//end of do while loop
            }//end of 1-9 test
            else {
                System.out.println("Error");
                return;
            }//if the integer is not proper
        }//end of int test
        else {
            System.out.println("Error");
            return;
        }//if there is not an integer
    }//end of method
}//end of class 