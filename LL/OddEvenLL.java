package LinkedLists;

import java.util.ArrayList;

public class OddEvenLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    static ArrayList<Integer> odd = new ArrayList<>();

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

    public void oddEven() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data % 2 != 0) {
                odd.add(temp.next.data);
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        OddEvenLL ll = new OddEvenLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(9);
        ll.addLast(10);
        ll.oddEven();
        for (int i = 0; i < odd.size(); i++) {
            ll.addLast(odd.get(i));
        }
        ll.printLL();

    }
}
