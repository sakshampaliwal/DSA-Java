class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Reverse {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        head=prev;
        return head;
    }
}
