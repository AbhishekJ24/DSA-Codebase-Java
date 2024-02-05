package LinkedLists;

public class ExchangeTwoNodes {
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

    public void printLL() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void addMiddle(int data, int index) {
        ListNode temp = head;
        ListNode newNode = new ListNode(data);
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void exhangeNodes(int a, int b) {
        int i = 0;
        int j = 0;
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.next.val == a) {
                temp.next = temp.next.next;
                break;
            }
            i++;
            temp = temp.next;
        }
        temp = head;
        while (temp.next != null) {
            if (temp.next.val == b) {
                temp.next = temp.next.next;
                break;
            }
            j++;
            temp = temp.next;
        }
        addMiddle(b, i);
        addMiddle(a, j);
    }

    public static void main(String[] args) {
        ExchangeTwoNodes ll = new ExchangeTwoNodes();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        exhangeNodes(2, 4);
        ll.printLL();
    }
}