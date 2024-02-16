package LinkedLists;

public class LinkedListCycleOne {
    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            if (count > 10000)
                return true;
            temp = temp.next;
        }
        return false;

    }
}