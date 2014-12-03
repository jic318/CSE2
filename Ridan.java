import java.util.Random;
import java.util.Scanner;
public class Ridan{
	

	public static void main(String [] arg){
		showHands();
		simulateOdds();
	}

	public static void showHands(){
		Scanner scan = new Scanner (System.in);
		String answer="";
		do{
			int[] hand = showOneHand();
			for (int i=0;i<4;i++) {
				switch(i){
					case 0:
					System.out.print("Clubs: ");
					break;
					case 1:
					System.out.print("Diamonds: ");
					break;
					case 2:
					System.out.print("Hearts: ");
					break;
					case 3:
					System.out.print("Spades: ");
					break;
					default:
				}
				for (int j=0;j<5;j++) {
					if(hand[j]/13==i)
					{
						switch((hand[j]%13)+1){
							case 1:
							System.out.print("A ");
							break;
							case 11:
							System.out.print("J ");
							break;
							case 12:
							System.out.print("Q ");
							break;
							case 13:
							System.out.print("K ");
							break;
							default:
							System.out.print(hand[j]%13+1+" ");
							break;				
						}
					}
				}
				System.out.println();
			}
			System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
			answer=scan.next();
		}while(answer.equals("Y") || answer.equals("y"));
	}


	public static void simulateOdds(){
		int[] repeatRec = new int[13];
		for(int temp=0;temp<10000;temp++){
			int[] hand = showOneHand();
			int test;
			for(int i=0;i<5;i++){
				hand[i]%=13;
			}
			test = exactlyOneDup(hand);
			if(test!=-1){
				repeatRec[test]++;
			}
		}
		System.out.println(" rank  freq of exactly one pair");
		int sum=0;
		for (int j=0;j<13;j++) {
			sum += repeatRec[j];
			switch(j+1){
				case 1:
				System.out.print("  A    ");
				System.out.print(repeatRec[j]);
				break;
				case 10:
				System.out.print("  10   ");
				System.out.print(repeatRec[j]);
				break;
				case 11:
				System.out.print("  J    ");
				System.out.print(repeatRec[j]);
				break;
				case 12:
				System.out.print("  Q    ");
				System.out.print(repeatRec[j]);
				break;
				case 13:
				System.out.print("  K    ");
				System.out.print(repeatRec[j]);
				break;
				default:
				System.out.print("  "+(j+1)+"    ");
				System.out.print(repeatRec[j]);
				break;				
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		System.out.println("total not exactly one pair: "+(10000-sum));
	}

	public static int[] showOneHand(){
		int[] hand = new int[5];
		int handNum=0;
		Random r = new Random();
		while(handNum<5){
			hand[handNum] = r.nextInt(52);
			for(int i=0;i<handNum;i++){
				if(hand[handNum]==hand[i]){
					handNum--;
					break;
				}
			}
			handNum++;
		}
		return hand;
	}

	public static int exactlyOneDup(int num[]){
		int repeatRec=1,repeatNum;
		int[] repeat = new int[num.length];
		for(int i=0;i<num.length;i++){
			if(repeat[i]==0){
				repeatNum=0;
				for(int j=i+1;j<num.length;j++){
					if(num[i]==num[j]){
						repeat[i]=repeat[j]=repeatRec;
						repeatNum++;
					}
				}
				if(repeatNum>1) {
					return -1;
				}
				else if (repeatNum>0){
					repeatRec++;
				}
			}
			if(repeatRec>2){
				return -1;
			}
		}
		
		if(repeatRec==1)
		{
			return -1;
		}
		else{
			for(int i=0;i<num.length;i++){
				if(repeat[i]==1){
					return num[i];
				}
			}
		}
		return -1;
	}

}