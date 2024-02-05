package Arrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int merged[]=new int[m+n];
        for(int i=0;i<m;i++){
           merged[i]=nums1[i];
        }
        int j=m;
        for(int i=0;i<n;i++){
            merged[j]=nums2[i];
            j++;
        }
        Arrays.sort(merged);
        if((m+n)%2==0){
            int temp=merged[((m+n)/2)-1]+merged[((m+n)/2)];
            return (double)temp/2.0;
        }
        return (double)merged[((m+n)/2)];
        
    }
    public static void main(String[] args) {
        int n1[]={1,2};
        int n2[]={3};
        int n3[]={3,4};
        System.out.println(findMedianSortedArrays(n1,n2));
        System.out.println(findMedianSortedArrays(n1,n3));
    }
}
