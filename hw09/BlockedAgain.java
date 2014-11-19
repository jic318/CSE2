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
        System.out.println("Input an int (Caonima)");
        while(true){
            while (!a.hasNextInt()){
                //wait input here
            }
            int ain=a.nextInt();
            if(checkInt(ain))
            {
                return ain;
            }//proper input
            else
            {
                System.out.println("Input an proper int (Caonima)");
            }//not int
        }
    }//end of method getInt

    public static boolean checkInt(int a) {
        if (a<=9&&a>0) {
            return true;
        }//proper range
        else {
            return false;
        }//inproper range
    }//end of method checkInt

public static void allBlocks (int a) {
    int i;
    for(i = 1; i<=a;i++)
    {
        block(i);
        String tempStr;
        int temp, time;
        tempStr="";
        for (temp=0; temp<9-i; temp++) {
        tempStr+=" ";
        }//print blank
        time=2*i-1;
        for (temp=0; temp<time; temp++) {
            tempStr+="-";
        }//print line
        System.out.println(tempStr);
    }//print the blocks
}//end of method allblocks

public static void block (int a) {
    
    String tempStr;
    int temp;
    tempStr=line(a);
    for (temp=0; temp<a; temp++) {
        System.out.println(tempStr);
    }//print block
}//end of method block


public static String line (int a) {
    String tempStr;
    int temp, time;
    tempStr="";
    for (temp=0; temp<9-a; temp++) {
        tempStr+=" ";
    }//print the blank
    time=2*a-1;
    for (temp=0; temp<time; temp++) {
        tempStr+=a;
    }//print a line

    return tempStr;    
}//end of method line
}
