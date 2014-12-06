//hw11 build a 3D array, find the minimum entry, and sort the 3rd slab
//jic318
import java.util.Random;
public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
   public static int[][][] buildMat3d() {
       int [][][] Ar=new int[3][][];
       for (int i1=0; i1<3; i1++) {
           Ar[i1]=new int[i1*2+3][];
           for (int i2=0; i2<Ar[i1].length; i2++) {
               Ar[i1][i2]=new int[i1+i2+1];
           }
       }
       for (int n=0; n<3; n++) {
           for (int n1=0; n1<Ar[n].length; n1++) {
               for (int n2=0; n2<Ar[n][n1].length; n2++) {
                   Ar[n][n1][n2]=(int)(Math.random()*99);
               }
           }
       }
       return Ar;
   }
   public static void show (int [][][] Ar) {
       System.out.println("-----------------Slab1");
       for (int i1=0; i1<Ar[0].length; i1++) {
           for (int i2=0; i2<Ar[0][i1].length; i2++) {
               System.out.print(Ar[0][i1][i2]+" ");
           }
           System.out.println();
       }
       System.out.println("-----------------Slab2");
       for (int i3=0; i3<Ar[1].length; i3++) {
           for (int i4=0; i4<Ar[1][i3].length; i4++) {
               System.out.print(Ar[1][i3][i4]+" ");
           }
           System.out.println();
       }
       System.out.println("-----------------Slab3");
       for (int i5=0; i5<Ar[2].length; i5++) {
           for (int i6=0; i6<Ar[2][i5].length; i6++) {
               System.out.print(Ar[2][i5][i6]+" ");
           }
           System.out.println();
       }
   }
   public static int findMin (int [][][] Ar) {
       int currentMin=Ar[0][0][0];
		for(int i=0;i<Ar.length;i++){
			for(int j=0;j<Ar[i].length;j++){
				for(int s=0;s<Ar[i][j].length;s++){
					if(Ar[i][j][s]<currentMin){
						currentMin=Ar[i][j][s];
					}
				}
			}
		}
		return currentMin;
       
   }
   public static void sort (int[][] A) {
       for(int i=0;i<A.length;i++){
			selectionSort(A[i]);
		}
		int s, insert, i; 
		for (s=1; s<A.length; s++){     
           insert=A[s][0];
			for(i=s-1; (i>=0)&&(A[i][0]>insert);i--){  
               int[] temp=A[i+1];
               A[i+1] = A[i];
               A[i] = temp;
			}
			A[i+1][0]=insert;    	
		}
   }
   public static void selectionSort (int[] S) {
       int currentMin;
		for(int i=0;i<S.length;i++){
			for(int j=i+1;j<S.length;j++){
				if(S[i]>S[j]){
					currentMin=S[i];
					S[i]=S[j];
					S[j]=currentMin;
				}
			}
		}
   }
       
}
