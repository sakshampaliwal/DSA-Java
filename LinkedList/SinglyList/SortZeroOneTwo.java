import org.w3c.dom.Node;

public class SortZeroOneTwo {
    public static Node sortList(Node head) {
        Node temp=head;
        int count0=0;
        int count1=0;
        int count2=0;
        if(head==null){
            return null;
        }
        while(temp!=null){
            if(temp.data==0){
                count0++;
            }
            else if(temp.data==1){
                count1++;
            }
            else{
                count2++;
            }
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<count0;i++){
            temp.data=0;
            temp=temp.next;
        }
        for(int j=0;j<count1;j++){
            temp.data=1;
            temp=temp.next;
        }
        for(int i=0;i<count2;i++){
            temp.data=2;
            temp=temp.next;
        }
        return head;

    }
    static Node segregate(Node head)
    {
        if (head == null || head.next == null) {
            return head;
        }

        Node zeroHead = new Node(0);
        Node oneHead = new Node(0);
        Node twoHead = new Node(0);
        Node zeroTail = zeroHead;
        Node oneTail = oneHead;
        Node twoTail = twoHead;

        Node current = head;
        while (current != null) {
            if (current.data == 0) {
                zeroTail.next = current;
                zeroTail = zeroTail.next;
            } else if (current.data == 1) {
                oneTail.next = current;
                oneTail = oneTail.next;
            } else {
                twoTail.next = current;
                twoTail = twoTail.next;
            }
            current = current.next;
        }

        zeroTail.next = oneHead.next != null ? oneHead.next : twoHead.next;
        oneTail.next = twoHead.next;

        // Set the tail of the two list to null to avoid cycles in the result list
        twoTail.next = null;

        return zeroHead.next;
    }
}
