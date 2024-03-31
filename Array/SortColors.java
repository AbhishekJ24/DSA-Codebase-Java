package Array;
public class SortColors{
    public static void sortColors(int[] nums) {
        // Dutch National Flag Problem
        int zeroes = 0;
        int ones = 0;
        int twos = 0;
        for (int n : nums) {
            if (n == 0)
                zeroes++;
            else if (n == 1)
                ones++;
            else
                twos++;
        }
        int k = 0;
        for (int i = 1; i <= zeroes; i++) {
            nums[k++] = 0;
        }
        for (int i = 1; i <= ones; i++) {
            nums[k++] = 1;
        }
        for (int i = 1; i <= twos; i++) {
            nums[k++] = 2;
        }
    }
    public static void main(String[] args) {
        int nums[]={0,2,2,1,0,1,1};
        sortColors(nums);
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}