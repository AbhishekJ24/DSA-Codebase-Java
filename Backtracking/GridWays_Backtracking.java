package Backtracking;

public class GridWays_Backtracking {
    public static int findGridWays(int n,int m,int i,int j){
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        //right
        int w1=findGridWays(n,m,i,j+1);
        //down
        int w2=findGridWays(n,m,i+1,j);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=4,m=5;
        System.out.println(findGridWays(n,m,0,0));
    }
}
