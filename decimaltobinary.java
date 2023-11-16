import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int dec=sc.nextInt();
        int temp=dec;
        int bin=0;
        int i=0;
        while(temp>0){
            int rem=temp%2;
            bin=bin + (int)(Math.pow(10,i)*rem);
            temp=temp/2;
            ++i;
        }
        System.out.println(bin);
        sc.close();
    }
}
