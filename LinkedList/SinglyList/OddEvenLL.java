public class OddEvenLL {
    public ListNode oddEvenList(ListNode head) {
        if(head==null ){
            return head;
        }
        ListNode evenhead=head.next;
        ListNode odd=head;
        ListNode even=head.next;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;

            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }
}
