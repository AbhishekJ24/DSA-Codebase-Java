package Stacks;

import java.util.Stack;

public class LargestRectangleHistorgram {
    public static int largestRectangleArea(int[] heights) {
        int l = heights.length;
        int maxArea = 0;
        int nextSmallerRight[] = new int[l];
        int nextSmallerLeft[] = new int[l];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < l; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nextSmallerLeft[i] = -1;
            } else {
                nextSmallerLeft[i] = st.peek();
            }
            st.push(i);

        }
        st = new Stack<>();
        for (int i = l - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nextSmallerRight[i] = l;
            } else {
                nextSmallerRight[i] = st.peek();
            }
            st.push(i);
        }

        for (int i = 0; i < l; i++) {
            int currArea = heights[i] * (nextSmallerRight[i] - nextSmallerLeft[i] - 1);
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(largestRectangleArea(arr));
    }
}