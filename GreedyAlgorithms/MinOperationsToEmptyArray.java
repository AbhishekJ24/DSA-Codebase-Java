package GreedyAlgorithms;

import java.util.HashMap;

public class MinOperationsToEmptyArray {
    public static int minOperations(int[] nums) {
        HashMap <Integer,Integer> counter = new HashMap<>();
        for (int num: nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (int c: counter.values()) {
            if (c == 1) {
                return -1;
            }
            ans += Math.ceil((double) c / 3);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={2,3,3,2,2,4,2,3,4};
        System.out.println(minOperations(nums));
    }
}
