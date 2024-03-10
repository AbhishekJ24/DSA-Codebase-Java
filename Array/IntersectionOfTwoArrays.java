package Array;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int n : nums1) {
            s1.add(n);
        }
        for (int n : nums2) {
            s2.add(n);
        }
        s1.retainAll(s2);
        int res[] = new int[s1.size()];
        int z = 0;
        for (int n : s1) {
            res[z++] = n;
        }
        return res;
    }
}