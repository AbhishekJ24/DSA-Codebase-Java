package LinkedLists;

public class PalindromeLinkedList {
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

    public static ListNode getMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nex;
        while (curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode midNode = getMidNode(head);
        ListNode rightHead = reverseLL(midNode.next);
        midNode.next = null;
        ListNode leftHead = head;
        while (leftHead != null && rightHead != null) {
            if (leftHead.val != rightHead.val)
                return false;
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }
        return true;
    }
}
