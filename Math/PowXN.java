package Math;

public class PowXN {
    public static double helper(double x, int n) {
        if (n == 0)
            return 1.0;
        if (n == 1)
            return x;
        double answer = helper(x, n / 2);
        if (n % 2 == 0)
            return answer * answer;
        else
            return answer * answer * x;
    }

    public static double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = Math.abs(n);
        }
        return helper(x, n);
    }

    public static void main(String[] args) {
        System.out.println(myPow(3,12));
    }
}
