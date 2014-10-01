//hw05  program that prompts the user to enter a choice of a burger, a soda, or fries
//jic318
//import
import java.util.Scanner;
//define a class
public class BurgerKing {
    //define a method
    public static void main(String[] args) {
        //begin
        Scanner S;
        S= new Scanner( System.in );
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.print("Fries (F or f) ");
        String choice=S.next();
        String choice2, choice3, choice4;
        int L=choice.length();
        int L2, L3, L4, L5;
        char Ji, Ji2, Ji3, Ji4, Ji5;
        switch (L) {
            case 1:
                Ji=choice.charAt(0);
                switch (Ji) {
                    case 'B':
                        System.out.println("Enter A or a for 'all the fixins'");
                        System.out.println("C or c for cheese");
                        System.out.print("N or n for none of the above ");
                        choice2=S.next();
                        L2=choice2.length();
                        switch (L2) {
                            case 1:
                                Ji2=choice2.charAt(0);
                                switch (Ji2) {
                                    
                                    case 'A':
                                        System.out.println("You ordered a burger with all the fixins");
                                        break;
                                    case 'a':
                                        System.out.println("You ordered a burger with all the fixins");
                                        break;
                                    case 'C':
                                        System.out.println("You ordered a burger with cheese");
                                        break;
                                    case 'c':
                                        System.out.println("You ordered a burger with cheese");
                                        break;
                                    case 'N':
                                        System.out.println("You ordered a burger with none of the above");
                                        break;
                                    case 'n':
                                        System.out.println("You ordered a burger with none of the above");
                                        break;
                                    default:
                                        System.out.println("Error!");
                                        break;
                                }//end of burger cases
                                break;
                            default:
                                System.out.println("A single character is required");
                                break;
                            
                            }//end of the burger length test
                        }//end of first order
                        break;
                    case 'b': 
                        case 'B':
                        System.out.println("Enter A or a for 'all the fixins'");
                        System.out.println("C or c for cheese");
                        System.out.print("N or n for none of the above ");
                        choice2=S.next();
                        L2=choice2.length();
                        switch (L2) {
                            case 1:
                                Ji2=choice2.charAt(0);
                                switch (Ji2) {
                                    
                                    case 'A':
                                        System.out.println("You ordered a burger with all the fixins");
                                        break;
                                    case 'a':
                                        System.out.println("You ordered a burger with all the fixins");
                                        break;
                                    case 'C':
                                        System.out.println("You ordered a burger with cheese");
                                        break;
                                    case 'c':
                                        System.out.println("You ordered a burger with cheese");
                                        break;
                                    case 'N':
                                        System.out.println("You ordered a burger with none of the above");
                                        break;
                                    case 'n':
                                        System.out.println("You ordered a burger with none of the above");
                                        break;
                                    default:
                                        System.out.println("Error!");
                                        break;
                                }//end of burger cases
                                break;
                            default:
                                System.out.println("A single character is required");
                                break;
                            
                            }//end of the burger length test
                            break;
                    case 'S':
                        System.out.print("Do you want Pepsi (p or P),Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
                        choice3=S.next();
                        L3=choice3.length();
                        switch(L3) {
                            case 1:
                                Ji3=choice3.charAt(0);
                                switch(Ji3) {
                                    case 'P':
                                        System.out.println("You ordered Pepsi");
                                        break;
                                    case 'p':
                                        System.out.println("You ordered Pepsi");
                                        break;
                                    case 'C':
                                        System.out.println("You ordered Coke");
                                        break;
                                    case 'c':
                                        System.out.println("You ordered Cokei");
                                        break;
                                    case 'S':
                                        System.out.println("You ordered Sprite");
                                        break;
                                    case 's':
                                        System.out.println("You ordered Sprite");
                                        break;
                                    case 'M':
                                        System.out.println("You ordered Mountain Dew");
                                        break;
                                    case 'm':
                                        System.out.println("You ordered Mountain Dew");
                                        break;
                                    default:
                                        System.out.println("Error!");
                                        break;
                                            
                                }//end of soda case
                                break;
                            default:
                                System.out.println("A single character expected");
                                break;
                        }//end of soda length
                        break;
                    case 's':
                        System.out.print("Do you want Pepsi (p or P),Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
                        choice3=S.next();
                        L3=choice3.length();
                        switch(L3) {
                            case 1:
                                Ji3=choice3.charAt(0);
                                switch(Ji3) {
                                    case 'P':
                                        System.out.println("You ordered Pepsi");
                                        break;
                                    case 'p':
                                        System.out.println("You ordered Pepsi");
                                        break;
                                    case 'C':
                                        System.out.println("You ordered Coke");
                                        break;
                                    case 'c':
                                        System.out.println("You ordered Cokei");
                                        break;
                                    case 'S':
                                        System.out.println("You ordered Sprite");
                                        break;
                                    case 's':
                                        System.out.println("You ordered Sprite");
                                        break;
                                    case 'M':
                                        System.out.println("You ordered Mountain Dew");
                                        break;
                                    case 'm':
                                        System.out.println("You ordered Mountain Dew");
                                        break;
                                    default:
                                        System.out.println("Error!");
                                        break;
                                            
                                }//end of soda case
                                break;
                            default:
                                System.out.println("A single character expected");
                                break;
                        }//end of soda length
                        break;
                    case 'F':
                        System.out.print("Do you want a large or small order of fries (l,L,s, or S)- ");
                        choice4=S.next();
                        L4=choice4.length();
                        switch(L4) {
                            case 1:
                                Ji4=choice4.charAt(0);
                                switch (Ji4) {
                                    case 'L':
                                        System.out.println("You ordered large fries");
                                        break;
                                    case 'l':
                                        System.out.println("You ordered large fries");
                                        break;
                                    case 'S':
                                        System.out.println("You ordered small fries");
                                        break;
                                    case 's':
                                        System.out.println("You ordered small fries");
                                        break;
                                    default:
                                        System.out.println("Error!");
                                        break;
                                }//end of fries case
                                break;
                            default:
                                System.out.println("A single character expected");
                                break;
                        }//end of length fries
                        break;
            default:
                System.out.println("a single character expected");
                break;
        }//end of length test
    }//end of method
    }//end of class
