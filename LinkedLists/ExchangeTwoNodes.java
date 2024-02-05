package LinkedLists;

public class ExchangeTwoNodes {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
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

    public static void exchangeNodes(int a, int b) {
        ListNode prev1=null;
        ListNode prev2=null;
        ListNode temp1=head;
        ListNode temp2=head;
        while(temp1!=null && temp1.val!=a){
            prev1=temp1;
            temp1=temp1.next;
        }
        while(temp2!=null && temp2.val!=a){
            prev2=temp2;
            temp2=temp2.next;
        }
        
    }

    public static void main(String[] args) {
        ExchangeTwoNodes ll = new ExchangeTwoNodes();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        exchangeNodes(2, 3);
        ll.printLL();
    }
}