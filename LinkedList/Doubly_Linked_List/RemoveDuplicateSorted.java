import java.util.TreeSet;

import org.w3c.dom.Node;

public class RemoveDuplicateSorted {
    Node removeDuplicates(Node head){
        Node i=head;
        Node j=head.next;
        while(j!=null){
            if(i.data!=j.data){
                i=i.next;
                i.data=j.data;
            }
            j=j.next;
        }
        i.next=null;
        return head;
    }
    // Using Set:
    Node removeDuplicates(Node head){
        TreeSet<Integer> set=new TreeSet<>();
        Node temp=head;
        while(temp!=null){
            set.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        for(int i:set){
            temp.data=i;
            temp=temp.next;
        }
        if(temp!=null){
            temp.prev.next=null;
        }
        return head;
    }
}
