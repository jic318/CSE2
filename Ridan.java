import java.util.Scanner;
public class Ridan {
    public static void main( String [] args ){
        Scanner S;
        S= new Scanner (System.in) ;
        System.out.print ("Input");
        while (!S.hasNextInt()) {
            System.out.println("Error!");
            S=new Scanner(System.in);
        }
        int a=S.nextInt();
        if (a>0) {
            System.out.println(a);
        }
        else {
            int b;
            while (a<=0) {
                System.out.println("Error");
                S=new Scanner (System.in);
                while (!S.hasNextInt()) {
                System.out.println("Error!");
                S=new Scanner(System.in);
                }
                a=S.nextInt();
                
            }
            System.out.println(a);
        }
        int A=sumsqr(a);
        System.out.println(A);
        int i2=0;
        for (int ACCA=0; ACCA<4; ACCA++) {
            
            if (ACCA==3 ) {
                ACCA-=3;
                i2++;
                
            }
            if(i2==3) {
                break;
            }
            
            System.out.println(ACCA);
        }
        
       
    }
    public static int sumsqr (int a) {
        int SUM=0, c;
        for (int i=1; i<=a; i++){
            SUM=(int)Math.pow(i,i);
            
            
        }
        return SUM;
    }
    

}