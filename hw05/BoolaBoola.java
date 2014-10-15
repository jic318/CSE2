//hw05 BoolaBoola- show the random statement is true or false
//jic318
//import
import java.util.Scanner;
//define a class
public class BoolaBoola {
  //define a method
  public static void main(String[] args) {
      //begin
      Scanner S;
      S= new Scanner(System.in);
      boolean F, S1, T, Kekka;
      int Katsu, Handan;
      String Ichi, Ni;
      Katsu=(int)(Math.random()*2);
      switch (Katsu) {
          case 0:
              F=true;
              break;
          case 1:
              F=false;
              break;
          default:
              F=false;
      }//define the first variable
      Katsu=(int)(Math.random()*2);
      switch (Katsu) {
          case 0:
              S1=true;
              break;
          case 1:
              S1=false;
              break;
          default:
        	  S1=false;
      }//define the second variable
      Katsu=(int)(Math.random()*2);
      switch (Katsu) {
          case 0:
              T=true;
              break;
          case 1:
              T=false;
              break;
          default:
        	  T=false;
      }//define the third variable
      Handan=(int)(Math.random()*4);
      switch (Handan) {
          case 0:
              Kekka=F||S1||T;
              Ichi="||";
              Ni="||";
              break;
          case 1:
              Kekka=F||S1&&T;
              Ichi="||";
              Ni="&&";
              break;
          case 2:
              Kekka=F&&S1||T;
              Ichi="&&";
              Ni="||";
              break;
          case 3:
              Kekka=F&&S1&&T;
              Ichi="&&";
              Ni="&&";
              break;
              default:
            	  Kekka=F&&S1&&T;
            	  Ichi="&&";
                  Ni="&&";
            	  break;
      }//define the symbols
      System.out.print("Dose "+F+Ichi+S1+Ni+T+" have the value true(t/T) or false(f/F)? ");
      String Ans=S.next();
      int length=Ans.length();
      switch (length) {
          case 1:
              char A=Ans.charAt(0);
              switch (A) {
                  case 'T':
                      if (Kekka==true) {
                          System.out.println("Correct");
                      }
                      else {
                          System.out.println("Wrong!");
                      }
                      break;
                  case 't':
                      if (Kekka==true) {
                          System.out.println("Correct");
                      }
                      else {
                          System.out.println("Wrong!");
                      }
                      break;
                  case 'F':
                      if (Kekka==false) {
                          System.out.println("Correct");
                      }
                      else {
                          System.out.println("Wrong!");
                      }
                      break;
                  case 'f':
                       if (Kekka==false) {
                          System.out.println("Correct");
                      }
                      else {
                          System.out.println("Wrong!");
                      }
                      break;
                  default:
                      System.out.println("Error!");
              break;
          
              }//end
      }//end of the length test
      
  }//end of method
}//end of class
