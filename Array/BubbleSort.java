package Array;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 12, 0, 10, 3, 9, 100, 43, 24, 90, 0 };
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(!flag)
            break;
        }
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}
