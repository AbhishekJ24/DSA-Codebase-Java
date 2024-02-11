package Array;

import java.util.Arrays;

public class MaxProdDiffTwoPairs {
    public static void main(String[] args) {
        int nums[]={5,6,2,7,4};
        Arrays.sort(nums);
        System.out.println((nums[nums.length - 1] * nums[nums.length - 2]) - (nums[1] * nums[0]));
    }
}