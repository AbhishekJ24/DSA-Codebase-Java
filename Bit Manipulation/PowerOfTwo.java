/* 
* any 2 raised to the power number is in the form of 1000000 or 10000000, i.e. 1 followed by zeroes
* when this number is bitwise anded with the number-1, results in zero, therefore, this can be done to range 
*/

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