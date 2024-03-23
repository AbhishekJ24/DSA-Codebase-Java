package LL;

public class ReorderLL {
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

    public void reorderList(ListNode head) {
        ListNode mid = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            mid = mid.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = mid.next;
        ListNode nex;
        while (curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        mid.next = null;
        ListNode rightHead = prev;
        ListNode leftHead = head;
        while (leftHead != null && rightHead != null) {
            ListNode t = leftHead.next;
            leftHead.next = rightHead;
            rightHead = rightHead.next;
            leftHead.next.next = t;
            leftHead = leftHead.next.next;
        }

    }
}
