package Stacks;

import java.util.Stack;

public class DuplicateParentheses {
    public static boolean isDuplicate(String exp) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            st.push(ch);
            if(st.peek()==')'){
                st.pop();
                int count=0;
                while(st.peek()!='('){
                    st.pop();
                    count++;
                }
                if(count<1)
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isDuplicate("((a+b)+(c+d))+(e*d)"));
    }
}