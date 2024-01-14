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

    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node leftHead, Node rightHead) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (leftHead != null && rightHead != null) {
            if(leftHead.data<=rightHead.data){
                temp.next=leftHead;
                leftHead=leftHead.next;
            }
            else{
                temp.next=rightHead;
                rightHead=rightHead.next;
            }
            temp=temp.next;
        }
        while(leftHead!=null){
            temp.next=leftHead;
            leftHead=leftHead.next;
            temp=temp.next;
        }
        while(rightHead!=null){
            temp.next=rightHead;
            leftHead=leftHead.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }

    public Node mSort(Node head) {
        // Base Case
        if (head == null || head.next == null)
            return head;

        // Finding Middle Node
        Node midNode = getMid(head);
        Node rightHead = midNode.next;
        midNode.next = null;

        // Dividing the left and right half further
        Node newLeft = mSort(head);
        Node newRight = mSort(rightHead);

        // Returning the merged sorted parts
        return merge(newLeft, newRight);
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
        head = ll.mSort(head);
        ll.printLL();
    }
}