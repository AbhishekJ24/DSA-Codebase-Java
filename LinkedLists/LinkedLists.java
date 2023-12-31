package LinkedLists;

public class LinkedLists {
    public static Node head;
    public static Node tail;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    // public void addMiddle(int data, int index) {
    //     Node temp = head;
    //     Node newNode = new Node(data);
    //     for (int i = 1; i <= index; i++) {
    //         temp = temp.next;
    //     }
    //     newNode.next = temp.next.next;
    //     temp.next = newNode;

    // }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        System.out.println();

        ll.printLL();
        ll.addFirst(6);
        ll.printLL();
        ll.addFirst(5);
        ll.printLL();
        ll.addFirst(4);
        ll.printLL();
        ll.addFirst(3);
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();

        ll.addLast(7);
        ll.printLL();
        ll.addLast(8);
        ll.printLL();
        ll.addLast(9);
        ll.printLL();
        ll.addLast(10);
        ll.printLL();
        ll.addLast(11);
        ll.printLL();
        ll.addLast(12);
        ll.printLL();

        // ll.addMiddle(10,6);
        ll.printLL();
    }
}
