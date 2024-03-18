package Stacks;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else {
                if (st.isEmpty())
                    return false;
                if ((ch == ')' && st.peek() == '(') ||
                        (ch == '}' && st.peek() == '{') ||
                        (ch == ']' && st.peek() == '['))
                    st.pop();
                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    // public static boolean isValid(String s) {
    //     Stack<Character> st = new Stack<>();
    //     for (char ch : s.toCharArray()) {
    //         if (ch == '(') {
    //             st.push(')');
    //         } else if (ch == '{') {
    //             st.push('}');
    //         } else if (ch == '[') {
    //             st.push(']');
    //         } else if (st.isEmpty() || st.pop()!=ch) {
    //             return false;
    //         }
    //     }
    //     return st.isEmpty();
    // }
    public static void main(String[] args) {
        System.out.println(isValid("[]{(][][][][]{{()}}"));
    }
}
