package Strings;

import java.util.Arrays;

public class MaximumOddBinaryNumber {
    public static String maximumOddBinaryNumber(String s) {
        if (s.length() == 0)
            return "0";
        if (s.length() == 1)
            return "1";
        int count = -1;
        char ch[] = s.toCharArray();
        for (char c : ch) {
            if (c == '1')
                count++;
        }
        Arrays.fill(ch, '0');
        ch[s.length() - 1] = '1';
        for (int i = 0; i < count; i++) {
            ch[i] = '1';
        }
        return new String(ch);

    }
    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("101010110011"));
    }
}
