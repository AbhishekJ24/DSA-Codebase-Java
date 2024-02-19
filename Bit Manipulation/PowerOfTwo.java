public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n == -2147483648)
            return false;
        if (n != 0 && (n & (n - 1)) == 0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(20));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(32));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1024));
    }
}