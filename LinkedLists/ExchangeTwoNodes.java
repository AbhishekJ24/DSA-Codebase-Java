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
    public static ListNode removeMiddle(ListNode head, int index){
        ListNode temp=head;
        for(int i=0;i<=index-2;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }

    public static ListNode exhangeNodes(int a, int b) {
        ListNode temp=head;
        int i=0;
        int j=0;
        while(temp.next!=null){
            if(temp.next.val==a)
            break;
            ++i;
            temp=temp.next;
        }
        temp=head;
        while(temp.next!=null){
            if(temp.next.val==b)
            break;
            ++j;
            temp=temp.next;
        }
        removeMiddle(head,i+1);
        addMiddle(b,i+1);
        removeMiddle(head,j+1);
        addMiddle(a,j+1);
        return head;
    }

    public static void main(String[] args) {
        ExchangeTwoNodes ll = new ExchangeTwoNodes();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        head=exhangeNodes(2, 4);
        ll.printLL();
    }
}