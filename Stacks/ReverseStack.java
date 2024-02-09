package Stacks;

import java.util.Stack;

public class ReverseStack {

    // THIS PROGRAM DOESNT TAKES UP EXTRA SPACE, IT OPERATES IN O(1) SPACE USING
    // RECURSION

    // RECURSIVE FUNCTION TO PUSH ANY ELEMENT AT THE BOTTOM OF THE STACK
    public static void pushBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushBottom(st, data);
        st.push(top);
    }

    // RECURSIVE FUNCTION TO REVERSE A STACK WHICH USES THE pushBottom FUNCTION TO
    // DO SO
    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int element = st.pop();
        reverse(st);
        pushBottom(st, element);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);

    }
}