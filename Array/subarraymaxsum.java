package Array;
public class subarraymaxsum {
    public static void main(String[] args) {
        int arr[] = { 1, -10, 2, 0, 9, 3 };
        int len = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                if (sum > max)
                    max = sum;
                System.out.println();
                sum = 0;
            }
        }
        System.out.println("Sum = " + max);
    }
}
