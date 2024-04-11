package Queues;

import java.util.*;

public class FirstNonRepeating {
    public static void firstNonRepeatingCharacter(String s){
        Queue <Character> q = new LinkedList<>();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']!=1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print("-1  ");
            }
            else{
                System.out.print(q.peek()+"  ");
            }
        }
    }
    public static void main(String[] args) {
        firstNonRepeatingCharacter("aabccxb");
    }
}
