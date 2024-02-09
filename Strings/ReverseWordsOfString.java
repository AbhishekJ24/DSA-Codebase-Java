package Strings;

import java.util.StringTokenizer;

public class ReverseWordsOfString {
    public static String reverseWords(String s) {
        s = s.trim();
        String rev = "";
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            rev = st.nextToken() + " " + rev;
        }
        return rev.substring(0, rev.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("   hello guys    how are you   !!!!!!   "));
    }
}
