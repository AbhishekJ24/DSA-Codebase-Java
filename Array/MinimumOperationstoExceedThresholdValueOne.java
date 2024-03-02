package Array;

import java.util.Arrays;

public class MinimumOperationstoExceedThresholdValueOne{
    public static int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k)
                count++;
            else
                continue;
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={1,2,1,1,3,5,6};
        System.out.println(minOperations(nums,3));
    }
}