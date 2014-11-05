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
            }
            else
            {
                System.out.println("Input an proper int (Caonima)");
            }
        }
    }//end of method getInt

    public static boolean checkInt(int a) {
        if (a<=9&&a>0) {
            return true;
        }
        else {
            return false;
        }
    }//end of method get

public static void allBlocks (int a) {
    int i;
    for(i = 1; i<=a;i++)
    {
        block(i);        
    }
}

public static void block (int a) {
    String tempStr;
    int temp;
    tempStr=line(a);
    for (temp=0; temp<a; temp++) {
        System.out.println(tempStr);
    }
    System.out.println(line (a,"-"));
}


public static String line (int a) {
    String tempStr;
    int temp, time;
    tempStr="";
    for (temp=0; temp<9-a; temp++) {
        tempStr+=" ";
    }
    time=2*a-1;
    for (temp=0; temp<time; temp++) {
        tempStr+=a;
    }

    return tempStr;    
}

public static String line (int a,String b) {
    String tempStr="";
    int temp, time;
    for (temp=0; temp<9-a; temp++) {
        tempStr+=" ";
    }
    time=2*a-1;
    for (temp=0; temp<time; temp++) {
        tempStr+=b;
    }
    return tempStr;    
}

}
