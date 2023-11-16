public class tilingproblem {
    public static int TilingProblem(int n){
        if(n==0 || n==1)
        return 1;

        return TilingProblem(n-1) + TilingProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(TilingProblem(0));
    }
}
