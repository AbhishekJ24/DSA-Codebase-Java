package LL;

public class MergeKSortedLists {
    public static class ListNode {
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

    public static ListNode merge(ListNode left, ListNode right) {
        ListNode mergedLL = new ListNode(-1);
        ListNode temp = mergedLL;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;

        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode mergedLL = new ListNode(Integer.MIN_VALUE);
        for (int i = -1; i < lists.length - 1; i++) {
            mergedLL = merge(mergedLL, lists[i + 1]);

        }
        return mergedLL.next;
    }
}
