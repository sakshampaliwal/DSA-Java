
public class FlattenALinkedList {
    Node merge(Node a, Node b){
        Node ans=new Node(0);
        Node temp=ans;
        while(a!=null && b!=null){
            if(a.data<b.data){
            ans.bottom=a;
            ans=ans.bottom;
            a=a.bottom;
            }
            else{
            ans.bottom=b;
            ans=ans.bottom;
            b=b.bottom;
            }
        }
        
        if(a!=null){
            ans.bottom=a;
        }
        else{
            ans.bottom=b;
        }
        return temp.bottom;
    }
    Node flatten(Node root)
    {
        if(root==null || root.next==null){
            return root;
        }
        root.next=flatten(root.next);
        root=merge(root,root.next);
        return root;
    }
}
