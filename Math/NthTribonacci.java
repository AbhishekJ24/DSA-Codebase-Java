package Math;
public class NthTribonacci{
    public static int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        int d=a+b+c;
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        if(n==2)
        return 1;
        if(n==3)
        return d;
        for(int i=4;i<=n;i++){
            a=b;
            b=c;
            c=d;
            d=a+b+c;
        }
        return d;
    }
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
}