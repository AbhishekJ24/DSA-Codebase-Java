package Queues;

import java.util.*;

public class FirstNonRepeating {
    public static void firstNonRepeatingCharacter(String s){
        Queue <Character> q = new LinkedList<>();
        int freq[]=new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        

    }
    public static void main(String[] args) {
        firstNonRepeatingCharacter("aabccxb");
    }
}
