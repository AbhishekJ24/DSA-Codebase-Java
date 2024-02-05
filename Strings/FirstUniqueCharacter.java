package Strings;

import java.util.HashMap;

public class FirstUniqueCharacter {
    // HashMap approach O(n) - 27ms
    public static int firstUniqChar1(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char a : s.toCharArray()) {
            mp.put(a, mp.getOrDefault(a, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    // One Liner O(n) function - 689ms
    public static int firstUniqChar2(String s) {
        for(int i=0;i<s.length();i++){
            if(!(s.substring(0,i)+s.substring(i+1)).contains(s.charAt(i)+""))
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqChar1("leetcode"));
        System.out.println(firstUniqChar2("leetcode"));
    }
}
