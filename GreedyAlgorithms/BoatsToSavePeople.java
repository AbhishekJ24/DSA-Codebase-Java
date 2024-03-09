package GreedyAlgorithms;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        int res = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            if (i == j) {
                res++;
                break;
            }
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
            } else
                j--;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[] { 5, 4, 3, 3, 2 }, 5));
    }
}