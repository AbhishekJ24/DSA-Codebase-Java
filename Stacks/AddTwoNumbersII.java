package Stacks;

import java.util.Stack;

public class AddTwoNumbersII {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st = new Stack<>();
        ListNode temp = l1;
        while (temp != null) {
            st1.push(temp.val);
            temp = temp.next;
        }
        temp = l2;
        while (temp != null) {
            st2.push(temp.val);
            temp = temp.next;
        }
        int carryBit = 0;
        while (!st1.isEmpty() && !st2.isEmpty()) {
            int d1 = st1.pop();
            int d2 = st2.pop();
            int sum = d1 + d2 + carryBit;
            st.push(sum % 10);
            carryBit = sum / 10;
            sum = 0;
        }
        while (!st1.isEmpty()) {
            int d = st1.pop();
            int sum = d + carryBit;
            st.push(sum % 10);
            carryBit = sum / 10;
            sum = 0;
        }
        while (!st2.isEmpty()) {
            int d = st2.pop();
            int sum = d + carryBit;
            st.push(sum % 10);
            carryBit = sum / 10;
            sum = 0;
        }
        while (carryBit > 0) {
            st.push(carryBit % 10);
            carryBit /= 10;
        }
        ListNode ll = new ListNode(-1);
        temp = ll;
        while (!st.isEmpty()) {
            temp.next = new ListNode(st.pop());
            temp = temp.next;
        }
        return ll.next;
    }
}