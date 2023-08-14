import java.util.HashMap;

public class CopyListwithRandomPointer {
    ublic Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            Node newnode=new Node(temp.val);
            map.put(temp,newnode);
            temp=temp.next;
        }

        Node t=head;
        while(t!=null){
            Node node=map.get(t);
            if(t.next!=null){
                node.next=map.get(t.next);
            }
            if(t.random!=null){
                node.random=map.get(t.random);
            }
            t=t.next;
        }
        return map.get(head);
    }
}
