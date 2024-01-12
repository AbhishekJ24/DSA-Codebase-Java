package Strings;

import java.util.HashSet;
import java.util.Set;

public class HalfStringsAlike {
    // NAIVE APPROACH
    public static boolean halvesAreAlike1(String s) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U')
                count1++;
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U')
                count2++;
        }
        if (count1 == count2)
            return true;
        else
            return false;
    }

    // SET APPROACH (OPTIMIZED THAN NAIVE APPROACH IN TERMS OF SPACE AND TIME BY A
    // BIT)
    public static boolean halvesAreAlike2(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int vowelsCount = 0;
        int midIndex = s.length() / 2;

        for (int i = 0; i < midIndex; i++) {
            char charA = s.charAt(i);
            char charB = s.charAt(midIndex + i);
            if (vowels.contains(charA))
                vowelsCount++;
            if (vowels.contains(charB))
                vowelsCount--;
        }

        return vowelsCount == 0;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike1("textbook"));
        System.out.println(halvesAreAlike2("hell"));
    }
}