package LinkedLists;

public class RemoveNthNodeFromEnd {
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

    public static ListNode head;
    public static ListNode tail;

    public void addLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp1 = head;
        while (temp1 != null) {
            size++;
            temp1 = temp1.next;
        }
        if (size == 1) {
            head = null;
            return head;
        }
        if (size == n) {
            head = head.next;
            return head;
        }
        ListNode temp2 = head;
        for (int i = 0; i < size - n - 1; i++) {
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return head;
    }

    public void printLL() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEnd ll = new RemoveNthNodeFromEnd();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        removeNthFromEnd(head, 2);
        ll.printLL();
    }
}
