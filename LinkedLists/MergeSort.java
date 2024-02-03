package LinkedLists;

public class MergeSort {
    public static Node head;
    public static Node tail;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
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

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeSort ll = new MergeSort();
        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(1);
        ll.addLast(0);
        ll.addLast(2);
        ll.addLast(8);
        ll.printLL();
    }
}