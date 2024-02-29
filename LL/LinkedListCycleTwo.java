package LL;

public class LinkedListCycleTwo {
    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        ListNode slowptr=head;
        ListNode fastptr=head;
        while(fastptr!=null && fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
            if(slowptr==fastptr)
            return true;
        }
        return false;
    }
}
