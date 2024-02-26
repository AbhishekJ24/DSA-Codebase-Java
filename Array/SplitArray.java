package Array;
public class SplitArray{
    public static boolean isPossibleToSplit(int[] nums) {
        int count[]=new int[101];
        for(int num:nums){
            count[num]++;
            if(count[num]>2) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,1,3,4,8};
        System.out.println(isPossibleToSplit(arr));
    }
}