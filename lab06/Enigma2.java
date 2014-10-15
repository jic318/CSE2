import java.util.Scanner;
public class Enigma2 {
  public static void main(String [] arg){
    Scanner S;
    S= new Scanner( System.in );
    int n=40,k=60;
    int out=S.nextInt();
    switch(n){
      case 12: 
      case 13: out+=13;
               break;
      case 40: out+=40;
               break;
    }
    System.out.println(out);
  }
}
