package Array;

import java.util.*;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        SortedSet<Integer> s = new TreeSet<>();
        for (int n : nums) {
            s.add(n);
        }
        int i = 0;
        for (int n : s) {
            nums[i++] = n;
        }
        return s.size();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] { 1, 1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 8, 9, 10 }));
    }
}
