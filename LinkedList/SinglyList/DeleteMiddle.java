public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        ListNode slow=temp;
        ListNode fast=temp;
        ListNode prev=temp;
        if(head.next==null || head==null){
            return null;
        }
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        prev.next=mid.next;
        return head;
    }
}
