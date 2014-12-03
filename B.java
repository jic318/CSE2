import java.util.Random;
public class B {
    public static void main(String[] args) {
        int [] Ra= new int [13];
        for (int kurikaesu=0; kurikaesu<10000; kurikaesu++) {
        int [] deck= new int[52];
        int temp;
        int [] hand= new int[5];
        int n;
        int [] RANKS= new int[5];
        for (int i=0; i<52; i++) {
            deck[i]=i;
            int Luan=(int)(Math.random()*52);
            temp=deck[i];
            deck[i]=deck[Luan];
            deck[Luan]=temp;
        }
        for (int i1=0; i1<5; i1++) {
            hand[i1]=deck[i1];
            RANKS[i1]=(hand[i1]+13)%13;
        }
        
        
        int CH=0, rank=-1, sum1=0;
        for (int i3=0; i3<5; i3++) {
            for (int i4=0; i4<5; i4++) {
                if (i4==i3) {
                    continue;
                }
                else {
                if (RANKS[i4]==RANKS[i3]) {
                    CH++;
                    rank=hand[i4];
                }
                }
            
            }
        }
        if (CH==2) {Ra[rank%13]+=1;}
        
        }
        for (int II=0; II<13; II++) {
            System.out.println(Ra[II]);
        }
        
        
    }
}