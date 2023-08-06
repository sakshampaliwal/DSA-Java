import java.util.HashSet;

public class LengthOfLoop {
    public int countNodesinLoop(Node head)
    {
        HashSet<Node> set=new HashSet<>();
        Node temp=head;
        int count=0;
        Node t=head;
        while(temp!=null){
            if(set.contains(temp)){
                break;
            }
            set.add(temp);
            t=temp;
            temp=temp.next;
        }
        if(temp!=null){
           while(temp!=t){
                count++;
                temp=temp.next;
            } 
            return count+1;
        }
        
        return 0;
    }
    static int countNodesinLoop1(Node head)
    {
        Node slow=head;
        Node fast=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=slow.next;
                count++;
                while(slow!=fast ){
                    count++;
                    slow=slow.next;
                }
                return count;
            }
        }
        return 0;
    }
}
