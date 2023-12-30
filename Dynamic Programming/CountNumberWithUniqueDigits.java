public class CountNumberWithUniqueDigits {
    public static int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[9];
        dp[0] = 1;
        dp[1] = 10;
        dp[2] = 91;
        for(int i=3; i<9; i++) {
            int count = 9;
            int ans = 9;
            for(int j=1; j<i; j++) {
                ans = ans * count;
                count--;
            }
            dp[i] = dp[i - 1] + ans;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(3));
    }
}
