package Array;

import java.util.Arrays;

public class hIndexOne {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations.length - i <= citations[i])
                return citations.length - i;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(hIndex(new int[] { 1, 0, 3, 5, 6, 2 }));
    }
}
