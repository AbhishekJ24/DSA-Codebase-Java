package LL;

import java.util.ArrayList;
import java.util.List;

public class ReverseKNodesGroups {
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

    public ListNode reverseKGroup1(ListNode head, int k) {
        if (k == 1)
            return head;
        ListNode current = head;
        int size = 0;
        List<ListNode> listNodes = new ArrayList<>();
        while (current != null) {
            listNodes.add(current);
            current = current.next;
            size++;
        }
        current = head;
        ListNode prev = null;
        ListNode result = new ListNode();
        ListNode temp = result;
        int i = 0;
        int j = 0;
        for (i = 0; i < size + 1; i++) {
            if (i != 0 && i % k == 0) {
                temp.next = prev;
                while (temp.next != null) {
                    temp = temp.next;
                }
                prev = null;
                j = i;
            }
            if (i == size)
                break;
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        for (; j < size; j++) {
            current = listNodes.get(j);
            temp.next = current;
            temp = temp.next;
        }
        temp.next = null;
        return result.next;
    }

    public ListNode reverseKGroup2(ListNode head, int k) {
        ListNode preTail = null;
        ListNode curHead = head;
        ListNode curTail = head;
        ListNode nextHead = null;
        while (curHead != null) {
            int count = 1;
            while (curTail.next != null && count < k) {
                curTail = curTail.next;
                count++;
            }
            if (count != k)
                break;
            nextHead = curTail.next;
            curTail.next = null;
            if (preTail != null) {
                preTail.next = null;
            }
            curTail = reverse(curHead);
            if (preTail != null)
                preTail.next = curTail;
            else
                head = curTail;
            curHead.next = nextHead;
            preTail = curHead;
            curHead = nextHead;
            curTail = nextHead;
        }
        return head;
    }

    private ListNode reverse(ListNode head) {
        ListNode preNode = null;
        ListNode curNode = head;
        ListNode nextNode = head;
        while (curNode != null) {
            nextNode = nextNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        return preNode;
    }
}