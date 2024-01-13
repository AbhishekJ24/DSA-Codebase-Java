package Strings;

public class MinStepsToMakeStringsAnagram{
    public static int minSteps(String s, String t) {
        int scount[]=new int[26];
        int tcount[]=new int[26];
        int count=0;
        for(char ch: s.toCharArray()){
            scount[ch-97]++;
        }
        for(char ch: t.toCharArray()){
            tcount[ch-97]++;
        }
        for(int i=0;i<26;i++)
        {
            count+=(Math.abs(scount[i]-tcount[i]));
        }
        return count/2;
    }
    public static void main(String[] args) {
        System.out.println(minSteps("leetcode","practice"));
    }
}