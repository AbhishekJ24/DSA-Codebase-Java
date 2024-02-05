package Stacks;

import java.util.ArrayList;

public class StackArrayList {
    public static class StAL {
        static ArrayList<Integer> st = new ArrayList<>();

        public boolean isEmpty() {
            return st.size() == 0;
        }

        public void push(int data) {
            st.add(data);
        }

        public int pop() {
            int top = st.get(st.size() - 1);
            st.remove(st.size() - 1);
            return top;
        }

        public int peek() {
            return st.get(st.size() - 1);
        }
    }

    public static void main(String[] args) {
        StAL stack = new StAL();
        System.out.println(stack.isEmpty());
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }
}
