public class palindrome {
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        for(int i=0;i<=1000;i++){
            if(i==reverse(i))
            System.out.print(i+" ");
        }
    }
    
}
