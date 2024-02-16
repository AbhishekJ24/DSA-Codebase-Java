package LinkedLists;
public class ZigzagLinkedList{
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

    public void zigzagLL(ListNode head){
        // FINDING MID NODE OF THE LINKED LIST
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        // REVERSING THE SECOND HALF OF THE LINKED LIST
        ListNode prev=null;
        ListNode curr=slow.next;
        ListNode nex;
        slow.next=null;
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }

        // ALTERNATE MERGING, I.E. OUR MAIN GOAL
        ListNode head1=head;
        ListNode head2=prev;
        ListNode nextLeft, nextRight;
        while(head1!=null && head2!=null){
            nextLeft=head1.next;
            head1.next=head2;
            nextRight=head2.next;
            head2.next=nextLeft;

            head1=nextLeft;
            head2=nextRight;
        }
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
        ZigzagLinkedList ll = new ZigzagLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.zigzagLL(head);
        ll.printLL();
    }
}