
public class Add_One_ToNo {
    static Node reverse(Node head){
        Node temp=head;
        Node prev=null;
        Node next=head;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    public static Node addOne(Node head) 
    { 
        head = reverse(head);
        
        Node curr = head, prev = head;
    
        int sum = curr.data + 1;
        curr.data = sum % 10;
        int carry = sum / 10;
    
        curr = curr.next;
        
        while(curr != null)
        {
            sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum / 10;
            prev = curr;
            curr = curr.next;
        }
        
        if(carry != 0)
        {
            prev.next = new Node(carry);
        }
        
        head = reverse(head);
        
        return head;
    }
}
