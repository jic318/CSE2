//hw06  to count the times one person can win if he/she make the bet for 1000 times
//jic318
//define a class
public class Roulette {
    //define a method
    public static void main (String[] args){
        //begin
        int i1=0, i2, countWin, R1, R2, away=0, away1=0, loss=0;//define the initial values
        while (i1<1000) {
            R1=(int)(Math.random()*38);//define what the player is going to bet
            countWin=0;
            i2=0;
            while (i2<100) {
                R2=(int)(Math.random()*38);
                if (R1==R2) {
                    countWin++;
                }//when the player wins
                i2++;
               
                
            }//end of the loop of 100 times
            
                if (countWin>=3) {
                    away++;
                }//when the player has pofit
                if (countWin<3&&countWin>0) {
                    away1++;
                }//when the profit is not suffcient    
                else if (countWin==0) {
                    loss++;
                }//when the player lose
                i1++;
        }//end of the loop of 1000 times
        System.out.println("The player walk away with profit for "+away+" times, and walk away with insufficient profit for "+away1+" times and lose for "+loss+" times");
        
        
    }//end of method
}//end of class