package Stacks;

import java.util.Stack;

public class PushAtBottom {
    public static void pushBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushBottom(st, data);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        pushBottom(st, 10);
        System.out.println(st);
    }
}