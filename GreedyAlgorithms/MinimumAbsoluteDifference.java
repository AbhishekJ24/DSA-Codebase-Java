package GreedyAlgorithms;

import java.util.*;

public class MinimumAbsoluteDifference{
    public static int minimumAbsoluteDiff(int arr1[], int arr2[]){
        int res = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            res += Math.abs(arr1[i]-arr2[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr1[] = {4,1,8,7};
        int arr2[] = {2,3,6,5};
        System.out.println(minimumAbsoluteDiff(arr1,arr2));
    }
}