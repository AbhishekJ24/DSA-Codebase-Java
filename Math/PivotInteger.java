package Math;

public class PivotInteger {

    // USING BRUTE FORCE APPROACH (O(N^2) TIME COMPLEXITY)
    public static int pivotInteger1(int n) {
        for (int x = 1; x <= n; x++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 1; i <= x; i++) {
                sum1 += i;
            }
            for (int i = x; i <= n; i++) {
                sum2 += i;
            }
            if (sum1 == sum2)
                return x;
        }
        return -1;
    }

    // USING MATH APPROACH (O(1) TIME COMPLEXITY)
    public static int pivotInteger2(int n) {
        int y = n * (n + 1) / 2;
        int x = (int) Math.sqrt(y);
        if (x * x == y)
            return x;
        else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotInteger1(8));
        System.out.println(pivotInteger1(1));
        System.out.println(pivotInteger1(4));

        System.out.println(pivotInteger2(8));
        System.out.println(pivotInteger2(1));
        System.out.println(pivotInteger2(4));
    }
}