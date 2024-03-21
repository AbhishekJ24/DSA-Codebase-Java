package LL;

public class RotateList {
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

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        k = k >= size ? k % size : k;
        if (k == 0 || size == 1)
            return head;
        temp = head;
        for (int i = 0; i < (size - k) - 1; i++) {
            temp = temp.next;
        }
        ListNode newFirst = temp.next;
        temp.next = null;
        temp = newFirst;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        return newFirst;
    }

    public static void main(String[] args) {

    }
}