package Array;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 12, 0, 10, 3, 9, 100, 43, 24, 90, 0 };
        for (int i = 0; i < arr.length-1; i++) {
            // finding min element
            int min = arr[i];
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    idx = j;
                    min = arr[j];
                }
            }
            // swap
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}