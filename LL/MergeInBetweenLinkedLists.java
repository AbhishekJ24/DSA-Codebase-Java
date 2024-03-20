package LL;

public class MergeInBetweenLinkedLists {
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

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1;
        for (int i = 0; i < Math.min(a, b) - 1; i++) {
            start = start.next;
        }
        ListNode end = list1;
        for (int i = 0; i <= Math.max(a, b); i++) {
            end = end.next;
        }
        start.next = null;
        start.next = list2;
        ListNode temp = list2;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = end;
        return list1;
    }
}