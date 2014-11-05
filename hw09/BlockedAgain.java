//hw-09 use method to print block
//jic318
import java.util.Scanner;
public class BlockedAgain{
public static void main(String []s){
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
allBlocks(m);
}
public static int getInt(){
    Scanner a;
    a=new Scanner (System.in);
    System.out.print("Enter an input, Shabi - ");
    if (a.hasNextInt()) {
        int a1=a.nextInt();
        int A1=checkInt(a1);
        return A1;
    }
    else {
        Scanner S;
        S=new Scanner(System.in);
        while (!S.hasNextInt()){
            System.out.println("Input an int (Caonima)");
            
        }
        int a2=S.nextInt();
        int A2=checkInt(a2);
        return A2;
    }
}//end of method getInt
public static int checkInt(int a) {
    if (a<=9&&a>0) {
        return a;
    }
    else {
        int b=getInt();
        while (b>9||b<=0) {
            System.out.println("Input a proper int (Caonimabi)");
            b=getInt();
        }
        return b;
    }
        
}//end of method get
public static void allBlocks (int a) {
    for (int i=1; i<=a; i++) {
        for (int i1=1; i1<=i; i1++) {
            String AA=kong(i), AB=block(i);
            System.out.println(AA+AB);
        }//print block
        String AC=line(i);
        String AA=kong(i);
        System.out.println(AA+AC);
    }//print
}//end of method allBlocks
public static String block (int a) {
    String Caodan="";
    for (int i=1; i<=2*a-1; i++) {
        Caodan+=a;
    }//prepare string
    return Caodan;
}//end of method block
public static String line (int a) {
    String Caonima="";
    for (int i=1; i<=2*a-1; i++) {
        Caonima+="-";
    }//prepare line
    return Caonima;
}//end of method line
public static String kong (int a) {
    String Aiyouwocao="";
    for (int i=a-1; i<=0; i--) {
        Aiyouwocao+=" ";
    }//print space
    return Aiyouwocao;
}//end of method kong
}
