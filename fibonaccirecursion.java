public class fibonaccirecursion {
    public static int fibo(int n){
        if(n==0 || n==1)
        return n;
        else
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            System.out.print(fibo(i)+"  ");
        }
    }
}
