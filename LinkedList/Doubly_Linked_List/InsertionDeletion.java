class InsertionDeletion {
    Node head;
    Node tail;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insertbeg(int data) {
        Node new_node = new Node(data);
        if (head == null && tail == null) {
            head = new_node;
            tail = new_node;
        } else {
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
        }
    }

    public void insertlast(int data) {
        Node new_node = new Node(data);
        if (head == null && tail == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
    }

    public void insertmid(int data, int loc) {
        Node new_node = new Node(data);
        if (head == null && tail == null) {
            head = new_node;
            tail = new_node;
        } 
        else {
            Node temp = head;
            int i = 0;
            while (i < loc - 2) {
                temp = temp.next;
                i++;
            }
            new_node.next = temp.next;
            new_node.prev = temp;
            if (temp.next != null) {
                temp.next.prev = new_node;
            }
            temp.next = new_node;
        }
        
    }

    public void dellast() {
        if (head == null) {
            System.out.println("No Nodes in Linked list");
        }
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            Node prev = temp;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            tail = prev;
        }
    }

    public void delbeg() {
        if (head.next.next != null) {
            head.next.prev = null;
        }
        head = head.next;
    }

    public void delmid(int loc) {
        Node temp = head;
        for (int i = 0; i < loc - 2; i++) {
            temp = temp.next;
        }
        if (temp.next.next != null) {
            temp.next.next.prev = temp;
        }
        temp.next = temp.next.next;
    }

    public void ll_length() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Length is:" + count);
    }

    public void search(int tofind) {
        Node temp = head;
        int check = 0;
        while (temp != null) {
            if (temp.data == tofind) {
                check = 1;
                break;
            }
            temp = temp.next;
        }
        if (check == 1) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }

    public void reverse() {
        Node temp=head;
        Node t;
        while(temp!=null){
            t=temp.next;
            temp.next=temp.prev;
            temp.prev=t;
            temp=temp.prev;
        }
        System.out.println(head.data);
        t=head;
        head=tail;
        tail=t;
        System.out.println(head.data);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--");
            temp = temp.next;
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
        System.out.println(list1.tail.data);
        list1.display();
        // list1.delmid(3);
        // list1.display();
        // list1.ll_length();
        // list1.search(40);
        list1.reverse();
        list1.display();
    }
}
