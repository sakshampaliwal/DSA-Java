public class StackUsingLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public void push(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }
    }
    public int pop(){
        if(head==null){
            return -1;
        }
        int temp=head.data;
        head=head.next;
        return temp;
    }
    public int peek(){
        if(head==null){
            return -1;
        }
        return head.data;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    

    public static void main(String[] args) {
        StackUsingLinkedList st=new StackUsingLinkedList();
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("After Pushing:");
        st.display();
        int x=st.pop();
        st.pop();
        st.pop();
        st.pop();
        int y=st.peek();
        System.out.println(y);
        System.out.println("After Popping:");
        st.display();
    }
}
