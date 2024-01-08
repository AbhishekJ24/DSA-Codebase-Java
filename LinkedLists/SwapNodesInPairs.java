package LinkedLists;

public class SwapNodesInPairs {
    class ListNode {
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

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        int t = temp.val;
        temp.val = temp.next.val;
        temp.next.val = t;
        swapPairs(temp.next.next);
        return temp;
    }
}