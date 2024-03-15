package Array;
public class ProductOfArrayExceptSelf{
    public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int prefix[] = new int[l];
        int suffix[] = new int[l];
        prefix[0] = 1;
        suffix[l - 1] = 1;
        for (int i = 1; i < l; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for (int i = l - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < l; i++) {
            suffix[i] *= prefix[i];
        }
        return suffix;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        arr = productExceptSelf(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}