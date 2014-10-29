//hw08 use method to modify the input value
//jic318
//import 
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
	}
  }
	public static char getInput (Scanner v, String v2) {
	    char c1, c2;
	    c1=v2.charAt(0);
	    c2=v2.charAt(1);
	    String v1=v.next();
	   
	    if (v1.equals("C")||v1.equals("c")) {
	        char cao=v1.charAt(0);
	        return cao;
	    }//if C or c is inputed
	    else {
	    	String v3="";
	        for (int i=0; i>=0&&!v3.equals("c")&&!v3.equals("C"); i++) {
	    	Scanner scan=new Scanner(System.in);
	    	System.out.print("You did not enter a character from the list 'Cc'; try again- ");
	    	v3=scan.next();
	        }//if input is inproper
	        char cao1=v3.charAt(0);
	        return cao1;
	    }//when quit
	    
	    
	}//end of method 1
	public static char getInput (Scanner v, String v2, int i1) {
		  String v1=v.next();
		  if (v1.equals("y")||v1.equals("Y")||v1.equals("n")||v1.equals("N")) {
		  	  char cao=v1.charAt(0);
		  	  return cao;
		  }// if y or Y or n or N is entered
		  else {
		    String v3="";
		  	for (int i=0; i<5&&!v3.equals("y")&&!v3.equals("Y")&&!v3.equals("n")&&!v3.equals("N"); i++) {
		  		Scanner scan=new Scanner(System.in);
		  		System.out.print("You did not enter a character from the list 'yYnN'; try again- ");
		  		v3=scan.next();
		  		
		  			
		  	}//enter again
		  	char cao2=v3.charAt(0);
		    if (cao2==('y')||cao2==('Y')||cao2==('n')||cao2==('N')) {
		    	return cao2;
		    }//if proper input appears
		    else {
		    	System.out.println("You failed after 5 tries");
		    	char cc=' ';
		    	return cc;
		    }//if proper input does not appear
		  }//if inputr is inproper
	}//end of method 2
	public static char getInput (Scanner v, String v2, String v3) {
		  String v4="";
		  System.out.print(v2);
		  String v1=v.next();
		  int l1=v1.length();
		  if (l1==1) { 
		      if (v1.equals("0")||v1.equals("`")||v1.equals("2")||v1.equals("3")||v1.equals("4")||v1.equals("5")||v1.equals("6")||v1.equals("7")||v1.equals("8")||v1.equals("9")) {
		  	    char cao=v1.charAt(0);
		  	    return cao;
		      }//if the input is proper
		      else {
		      	System.out.println("Enter exactly one character");
		        
		  	for (int i=0; i>=0&&!v1.equals("0")&&!v1.equals("1")&&!v1.equals("2")&&!v1.equals("3")&&!v1.equals("4")&&!v1.equals("5")&&!v1.equals("6")&&!v1.equals("7")&&!v1.equals("8")&&!v1.equals("9"); i++) {
		  		Scanner scan=new Scanner(System.in);
		  		System.out.print(v2);
		  		v4=scan.next();
		  		
		  	}//enter a new digit
		  	char cao1=v4.charAt(0);
		  	
		  		return cao1;
	
		      }//if input is inproper
		   }//if length is proper
		  else {
		  	System.out.println("Enter an acceptable character");
		  	Scanner scan=new Scanner(System.in);
		  	for (int i=0; i>=0&&!v1.equals("0")&&!v1.equals("1")&&!v1.equals("2")&&!v1.equals("3")&&!v1.equals("4")&&!v1.equals("5")&&!v1.equals("6")&&!v1.equals("7")&&!v1.equals("8")&&!v1.equals("9"); i++) {
		  		System.out.print(v2);
		  		v4=scan.next();
		  		
		  	}//enter new digit
		  	char cao1=v4.charAt(0);
		  	
		  		return cao1;
		  
		  }//input is inproper
		  
	}//end of method 3
}
