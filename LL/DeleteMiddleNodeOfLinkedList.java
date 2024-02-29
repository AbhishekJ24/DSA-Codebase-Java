package LL;
public class DeleteMiddleNodeOfLinkedList{
    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public ListNode deleteMiddle(ListNode head) {
        ListNode slowptr=head;
        ListNode fastptr=head;
        ListNode prev=head;
        if(head.next==null)
        return null;
        while(fastptr!=null && fastptr.next!=null){
            prev=slowptr;
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        prev.next=slowptr.next;
        return head;
    }
}