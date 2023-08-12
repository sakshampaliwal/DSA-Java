import java.util.HashSet;

public class IntersectionTwoLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null){
            temp2=headB;
            while(temp2!=null){
                if(temp1==temp2){
                    return temp1;
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return null;
    }
//Better:
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        HashSet<ListNode> set=new HashSet<>();
        while(temp1!=null){
            set.add(temp1);
            temp1=temp1.next;
        }
        while(temp2!=null){
            if(set.contains(temp2)){
                return temp2;
            }
            temp2=temp2.next;
        }
        return null;
    }
    // Optimal1:
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int len1=0;
        int len2=0;
        while(temp1!=null){
            len1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            len2++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        if(len1>len2){
            int diff=len1-len2;
            while(diff!=0){
                temp1=temp1.next;
                diff--;
            }
        }
        else{
            int diff=len2-len1;
            while(diff!=0){
                temp2=temp2.next;
                diff--;
            }
        }
        while(temp1!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
    //Optimal2:
    public ListNode getIntersectionNode4(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null || temp2!=null){
            if(temp1==null){
                temp1=headB;
            }
            if(temp2==null){
                temp2=headA;
            }
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}
