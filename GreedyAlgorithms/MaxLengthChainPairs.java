package GreedyAlgorithms;

import java.util.*;

public class MaxLengthChainPairs {
    public static void main(String[] args) {
        int arr[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));
        int l = 1;
        int last = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] > last) {
                l++;
                last = arr[i][1];
            }
        }
        System.out.println(l);
    }
}
