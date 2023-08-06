public class RemoveNnodefromend {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode t=head;
        int length=0;
        while(t!=null){
            length++;
            t=t.next;
        }
        if(length==n){
            head=head.next;
            return head;
        }
        int l=length-n;
        for(int i=0;i<l-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;     

        for(int i = 1; i <= n; ++i)
            fast = fast.next;
    
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return start.next;
    }
}
