package LinkedLists;

public class AddTwoNumber {
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
        ListNode temp = new ListNode(0);
        int count = 0;
        ListNode head = temp;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                count += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                count += l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode(count % 10);
            temp = temp.next;
            count = count / 10;
        }
        if (count == 1) {
            temp.next = new ListNode(1);

        }
        return head.next;
    }
}
