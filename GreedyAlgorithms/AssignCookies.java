package GreedyAlgorithms;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren = 0;
        int cookieIndex = 0;
        while (cookieIndex < s.length && contentChildren < g.length) {
            if (s[cookieIndex] >= g[contentChildren]) {
                contentChildren++;
            }
            cookieIndex++;
        }
        return contentChildren;
    }

    public static void main(String[] args) {
        int g[] = { 1, 1, 2, 3, 4, 5, 6, 10 };
        int s[] = { 2, 2, 4, 8 };
        System.out.println(findContentChildren(g, s));
    }
}