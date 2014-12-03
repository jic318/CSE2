import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
    
    
  }
  public static void showHands () {
      int[] deck=new int[52];//prepare deck
      
      
      String[] ranks = new String[13];
      for (int i=0; i<ranks.length; i++) {
          ranks[i]="";
          switch (i) {
              case 0: ranks[i]+="A";
              break;
              case 1: ranks[i]+="K";
              break;
              case 11: ranks[i]+="J";
              break;
              case 13: ranks[i]+="Q";
              break;
              default: ranks[i]+=i;
              break;
          }
          
      }//identify rank

      for(int i=0; i<deck.length; i++) {
          deck[i]=i;
      }
 
      for(int i=0; i<deck.length; i++) {
          int index=(int)(Math.random()*deck.length);
          int temp=deck[i];
          deck[i]=deck[index]; 
          deck[index]=temp;
      }//shuffle
      String[] suit= {"Club: ", "Diamond: ", "Spade: ", "Heart: "};
      for(int i=0; i<5; i++) {
          
          String rank1=ranks[deck[i]%13];
          if ((int)deck[i]/13==0) {
              suit[0]+=rank1+" ";
          }
          else if ((int)deck[i]/13==1) {
              suit[1]+=rank1+" ";
          }
          else if ((int)deck[i]/13==2) {
              suit[2]+=rank1+" ";
          }
          else if ((int)deck[i]/13==3) {
              suit[3]+=rank1+" ";
          }
          
          
      }//identify suit
      for (int pr=0; pr<4; pr++) {
          System.out.println(suit[pr]);
      }//print 
      String jiba="";
      Scanner S;
      S= new Scanner(System.in);
      System.out.print("Try again? Enter 'y' or 'Y', anything else to quit- ");
      jiba=S.next();//input y or Y to continue
      while (jiba.equals("Y")||jiba.equals("y")) {
          int[] deckk=new int[52];
      
      
      String[] rankss = new String[13];
      for (int i1=0; i1<rankss.length; i1++) {
          rankss[i1]="";
          switch (i1) {
              case 0: rankss[i1]+="A";
              break;
              case 1: rankss[i1]+="K";
              break;
              case 11: rankss[i1]+="J";
              break;
              case 12: rankss[i1]+="Q";
              break;
              default: rankss[i1]+=i1;
              break;
          }
          
      }

      for(int i1=0; i1<deckk.length; i1++) {
          deckk[i1]=i1;
      }
 
      for(int i1=0; i1<deckk.length; i1++) {
          int indexx=(int)(Math.random()*deckk.length);
          int tempp=deckk[i1];
          deckk[i1]=deckk[indexx]; 
          deckk[indexx]=tempp;
      }
      String[] suitt= {"Club: ", "Diamond: ", "Spade: ", "Heart: "};
      for(int i1=0; i1<5; i1++) {
          
          String rank11=rankss[deckk[i1]%13];
          if ((int)deckk[i1]/13==0) {
              suitt[0]+=rank11+" ";
          }
          else if ((int)deckk[i1]/13==1) {
              suitt[1]+=rank11+" ";
          }
          else if ((int)deckk[i1]/13==2) {
              suitt[2]+=rank11+" ";
          }
          else if ((int)deckk[i1]/13==3) {
              suitt[3]+=rank11+" ";
          }
          
          
      }
      for (int pr=0; pr<4; pr++) {
          System.out.println(suitt[pr]);
      }
      S= new Scanner(System.in);
      System.out.print("Try again? Enter 'y' or 'Y', anything else to quit- ");
      jiba=S.next();
      
      } 
  }//end of showhands
 public static void simulateOdds () {
     
     
     int[] List1={0,0,0,0,0,0,0,0,0,0,0,0,0}; 
     for (int iI=0; iI<100000; iI++) {
        int[] deck=new int[52];
        int[] hand=new int[5];
        for(int i=0; i<deck.length; i++) {
          deck[i]=i;
        }
 
        for(int i=0; i<deck.length; i++) {
          int index=(int)(Math.random()*deck.length);
          int temp=deck[i];
          deck[i]=deck[index]; 
          deck[index]=temp;
        }
        for(int i=0; i<5; i++) {
          hand[i]=deck[i];
        }
       int CH=0, Record=-1;
        for (int i1=0; i1<5; i1++) {
          for (int i2=0; i2<i1; i2++) {
            if (hand[i1]%13==hand[i2]%13) {
              CH++;
              Record=(int) hand[i1]%13;
            } 
          }
        }
        
        if (CH!=1&&Record<=12&&Record>=0) {
          List1[Record]+=1;
        }
       
        else {
          continue;
        } 
 }
 int SUM=0;
 
 String[] List2={"Ace ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","J ","Q ","K "};
 for (int Ha=0; Ha<13; Ha++) {
   SUM+=List1[Ha];
 }
 
 for (int M=0; M<13; M++) {
   System.out.println(List2[M]+List1[M]);
 }
 System.out.println("total not exactly one pair "+SUM);

 }
 
}
      
      
      
          
 

