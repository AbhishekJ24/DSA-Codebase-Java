package GreedyAlgorithms;

import java.util.Arrays;

public class BagOfTokens {
    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0;
        int j = tokens.length - 1;
        int score = 0;
        int max = Integer.MIN_VALUE;
        while (i <= j) {
            max = Math.max(score, max);
            if (power >= tokens[i]) {
                power -= tokens[i];
                score++;
                i++;
            } else if (score > 0) {
                power += tokens[j];
                score--;
                j--;
            } else {
                i++;
                j--;
            }
        }
        return Math.max(score, max);
    }

    public static void main(String[] args) {
        System.out.println(bagOfTokensScore(new int[] { 200, 100, 300, 200, 100 }, 150));
    }
}