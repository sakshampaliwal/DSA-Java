public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        int len=0;
        
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        len++;
        temp.next=head;
        temp=head;
        k=k%len;
        for(int i=0;i<len-k-1;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
