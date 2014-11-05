public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    public static int addDigit (int a, int b) {
        int RE;
        String s="", s1="", s2="";
        if (a>=0) {
            s1+=b;
            s2+=a;
            s=s1+s2;
            
        }
        else {
            int n=-a;
            s1+=b;
            s2+=n;
            s="-"+s1+s2;
            
        }
        RE=(int)s;
        return RE;
    }
    public static int join (int a, int b) {
        int RE;
        String s="", s1="", s2="";
        if (a>0&&b>0) {
            s1+=a;
            s2+=b;
            s=s1+s2;
        }
        else {
            int n1=-a, n2=-b;
            s1+=n1;
            s2+=n2;
            s=s1+s2;
        }
        RE=(int)s;
        return RE;
    }
    
}  
