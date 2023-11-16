import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N: ");
        int n=sc.nextInt();
        int fact=1;
        while(n>=1){
            fact*=n;
            n-=1;
        }
        System.out.println("FACTORIAL: "+fact);
        sc.close();
    }
}