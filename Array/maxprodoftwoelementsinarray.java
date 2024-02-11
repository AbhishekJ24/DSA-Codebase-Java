package Array;

public class maxprodoftwoelementsinarray {
    public static int maxProduct(int[] nums) {
        int lp=0;
        int rp=nums.length-1;
        int max=Integer.MIN_VALUE;
        while(lp<rp){
            int value=(nums[lp]-1)*(nums[rp]-1);
            max=Math.max(max,value);
            if(nums[lp]<nums[rp])
            lp++;
            else
            rp--;
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(maxProduct(nums));
    }
}
