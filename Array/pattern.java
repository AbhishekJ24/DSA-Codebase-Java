package Array;
import java.util.Scanner;
public class pattern{
    public void pattern1(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public void pattern2(int m){
        for(int i=m;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public void pattern3(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void pattern4(int m){
        char num='A';
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public void pattern5(int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==(m-1) || j==(n-1))
                System.out.print("*  ");
                else
                System.out.print("   ");
            }
            System.out.println();
        }
    }
    public void pattern6(int m){
        for(int i=0;i<m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
    public void pattern7(int m){
        int n=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+"\t");
                n++;
            }
            System.out.println();
        }
    }
    // public void pattern8(int m){
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<m;j++){
    //             if((i+j)==(m-1)){
    //                 for(int k=0;k<m-j;k++){
    //                     System.out.print("* ");
    //                 }
    //             }
    //             else
    //             System.out.print("  ");
    //         }
    //         System.out.println();
    //     }
    // }
    public void pattern8(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern9(int m){
        int flag;
        for(int i=1;i<=m;i++){
            if(i%2!=0)
            flag=1;
            else
            flag=0;
            for(int j=1;j<=i;j++){
                System.out.print(flag+" ");
                if(flag==1)
                flag=0;
                else
                flag=1;
            }
            System.out.println();
        }
    }
    public void pattern10(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<2*(m-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=m;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<2*(m-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern11(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=(2*m)-1;j++){
                if((i+j)>=(m+1) && (i+j)<2*m)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    // public void pattern11(int m){
    //     for(int i=1;i<=m;i++){
    //         for(int j=1;j<=m-i;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1;j<=m;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    public void pattern12(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=m;j++){
                if(i==1 || i==m || j==1 || j==m)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public void pattern13(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i=m;i>=1;i--){
            for(int j=1;j<=m-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public void pattern14(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i=m;i>=1;i--){
            for(int j=1;j<=m-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of m: ");
        int m=sc.nextInt();
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();
        pattern ob = new pattern();
        System.out.println();
        System.out.println();
        ob.pattern1(m); // star pattern
        System.out.println();
        System.out.println();
        ob.pattern2(m); // inverted star pattern
        System.out.println();
        System.out.println();
        ob.pattern3(m); // half pyramid
        System.out.println();
        System.out.println();
        ob.pattern4(m); // character pattern
        System.out.println();
        System.out.println();
        ob.pattern5(m,n); // hollow rectangle
        System.out.println();
        System.out.println();
        ob.pattern6(m); // inverted half pyramid with numbers pattern
        System.out.println();
        System.out.println();
        ob.pattern7(m); // floyd's triangle
        System.out.println();
        System.out.println();
        ob.pattern8(m); // inverted and rotated half pyramid
        System.out.println();
        System.out.println();
        ob.pattern9(m); // 0-1 triangle pattern
        System.out.println();
        System.out.println();
        ob.pattern10(m); // butterfly pattern
        System.out.println();
        System.out.println();
        ob.pattern11(m); // solid rhombus pattern
        System.out.println();
        System.out.println();
        ob.pattern12(m); // hollow rhombus pattern
        System.out.println();
        System.out.println();
        ob.pattern13(m); // diamond pattern
        System.out.println();
        System.out.println();
        ob.pattern14(m); // number pyramid pattern
        System.out.println();
        System.out.println();
        sc.close();
    }
}