package Stacks;

import java.util.*;

class MinStack {
    ArrayList<Integer> st;

    public MinStack() {
        st = new ArrayList<Integer>();
    }

    public void push(int val) {
        st.add(val);
    }

    public void pop() {
        st.remove(st.size() - 1);
    }

    public int top() {
        return st.get(st.size() - 1);
    }

    @SuppressWarnings("unchecked")
    public int getMin() {
        @SuppressWarnings("rawtypes")
        ArrayList st1 = (ArrayList) st.clone();
        Collections.sort(st1);
        return (int) st1.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
