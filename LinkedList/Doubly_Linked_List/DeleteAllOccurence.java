public class DeleteAllOccurence {
    static Node deleteAllOccurOfX(Node head, int x) {
        if(head == null){
            return null;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==x){
                if(temp.prev==null){
                    head=temp.next;
                    if(head != null){
                        head.prev=null;
                    }
                }
                else if(temp.next==null){
                    temp=temp.prev;
                    temp.next=null;
                }
                else{
                    Node t=temp.prev;
                    temp.prev.next=temp.next;
                    temp.next.prev=temp.prev;
                    temp=t;
                }
            }
            temp=temp.next;
        }
        return head;
    }
}
