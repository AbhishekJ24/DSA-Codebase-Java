package Stacks;

import java.util.Stack;

public class StockSpan {
    public static void calcSpan(int stocks[], int span[]) {
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);
        for (int i = 1; i < stocks.length; i++) {
            while (!st.isEmpty() && stocks[i] >= stocks[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - st.peek();
            st.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        calcSpan(stocks, span);
        for (int element : span) {
            System.out.print(element + " ");
        }
    }
}
