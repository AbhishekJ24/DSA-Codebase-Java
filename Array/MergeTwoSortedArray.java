package Array;

import java.util.Arrays;

public class MergeTwoSortedArray{
    
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m,j=0;i<m+n;i++,j++){
            nums1[i]=nums2[j];
        }
        Arrays.sort(nums1);
        return nums1;
    }
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        nums1=merge(nums1,3,nums2,3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }
}