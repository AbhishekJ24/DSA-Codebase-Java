package Array;

public class hIndexTwo {
    public static int hIndex(int[] citations) {
        int l = citations.length;
        int beg = 0;
        int end = l - 1;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (l - mid <= citations[mid])
                end = mid - 1;
            else
                beg = mid + 1;
        }
        return l - beg;
    }

    public static void main(String[] args) {
        System.out.println(hIndex(new int[] { 0, 1, 4, 5, 6, 9 }));
    }
}
