import java.util.HashSet;
// https://leetcode.com/problems/linked-list-cycle-ii/description/

public class StartPointLoop {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp)){
                return temp;
            }
            set.add(temp);
            temp=temp.next;
        }
        return null;
    }
    public ListNode detectCycle1(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode entry=head;
                while(entry!=slow){
                    slow=slow.next;
                    entry=entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}

