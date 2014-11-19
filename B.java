public class B {
    public static void main(String[] args) {
        int b=0, c=0;
        for (int A=1; A<=10000; A++) {
            for (int i=1; i<=A; i++) {
                int a=A%i;
                if (a==0) {
                    b++;
                }
            }
            int DD=b%2;
            if (DD==0) {
                c++;
               System.out.println(c);
            }
            
        }
        
        
        
    }
}