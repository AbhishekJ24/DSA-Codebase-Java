package GreedyAlgorithms;

import java.util.ArrayList;

public class CanonicalCurrencyChange {
    public static void main(String[] args) {
        int money = 590;
        int arr[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 }; // canonical system currency
        int res = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= money) {
                while (arr[i] <= money) {
                    money -= arr[i];
                    res++;
                    al.add(arr[i]);
                }
            }
        }
        System.out.println(res + " " + al);
    }
}
