import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
      Scanner scan;
    System.out.print("Enter an int- ");
    scan=new Scanner(System.in);
    int n;
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
               break;
      default:
        System.out.println("To repeat, you entered "+n);
        break;
    }
  }
}
