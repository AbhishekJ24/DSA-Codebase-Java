public class NumberOfDiceWithTargetSum{
    static int MOD = 1000000007;
    
    public static int numRollsToTarget(int n, int k, int target) {
        if (n == 0 && target == 0) 
            return 1;
        if (target < n || n * k < target) 
            return 0;
        
        int[][] dp = new int[n + 1][target + 1];
        
        for (int i = 1; i <= k && i <= target; i++) {
            dp[1][i] = 1;
        }
        
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                for (int x = 1; x <= k && x < j; x++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - x]) % MOD;
                }
            }
        }
        
        return dp[n][target];
    }
    public static void main(String[] args) {
        System.out.println(numRollsToTarget(1,6,3));
    }
}