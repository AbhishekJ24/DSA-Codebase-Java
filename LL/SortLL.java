package LL;
import java.util.ArrayList;
import java.util.Collections;

public class SortLL {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // SORTING LINKED LIST IN O(n) SPACE, I.E. EXTRA SPACE
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            li.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(li);
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = li.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
}
