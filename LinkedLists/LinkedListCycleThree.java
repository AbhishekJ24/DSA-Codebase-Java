package LinkedLists;

public class LinkedListCycleThree {
    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode checkCycle(ListNode head){
        ListNode slowptr=head;
        ListNode fastptr=head;
        while(fastptr!=null && fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
            if(slowptr==fastptr)
            return fastptr;
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=checkCycle(head);
        if(fast!=null){
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
        else
        return null;
    }
}
