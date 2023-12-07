package Recursion;
public class checksorted {
    public static boolean checkSortedOrNot(int a[], int i) {
        if (i == a.length - 1)
            return true;
        else {
            if (a[i] < a[i + 1]) {
                checkSortedOrNot(a, i + 1);
                return true;
            } else
                return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(checkSortedOrNot(arr, 0));
    }
}
