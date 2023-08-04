class InsertionDeletion {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public void insertbeg(int data){
        Node new_node=new Node(data);
        if(head==null && tail==null){
            head=new_node;
            tail=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }
    }
    public void insertlast(int data){
        Node new_node=new Node(data);
        if(head==null && tail==null){
            head=new_node;
            tail=new_node;
        }
        else{
            tail.next=new_node;
            tail=new_node;
        }
    }
    public void insertmid(int data,int loc){
        Node new_node=new Node(data);
        if(head==null && tail==null){
            head=new_node;
            tail=new_node;
        }
        else{
            Node temp = head;
            int i = 0;
            while (i < loc-2) {
                temp = temp.next;
                i++;
            }
            new_node.next = temp.next;
            temp.next = new_node;
        }
    }
    public void dellast(){
        if(head==null){
            System.out.println("No Nodes in Linked list");
        }
        if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            Node prev=temp;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            tail=prev;
        }
    }
    public void delbeg(){
        head=head.next;
    }
    public void delmid(int loc){
        Node temp=head;
        for(int i=0;i<loc-2;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public void ll_length(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Length is:"+count);
    }
    public void search(int tofind){
        Node temp=head;
        int check=0;
        while(temp!=null){
            if(temp.data==tofind){
                check=1;
                break;
            }
            temp=temp.next;
        }
        if(check==1){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element Not Found");
        }
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
        InsertionDeletion list1 = new InsertionDeletion();
        // list1.insertbeg(23);
        list1.insertmid(10, 1);
        list1.insertmid(20, 2);
        list1.insertmid(30, 3);
        list1.insertmid(40, 4);
        list1.search(47);
        // list1.display();
        // list1.delmid(3);
        list1.display();
        list1.ll_length();
    }
}
