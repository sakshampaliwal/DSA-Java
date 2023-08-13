import java.util.ArrayList;

public class FindPairwithGivenSum {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        Node temp1=head;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        while(temp1!=null){
            Node temp2=temp1.next;
            while(temp2!=null){
                if(temp1.data+temp2.data==target){
                    ArrayList<Integer> templist=new ArrayList<>();
                    templist.add(temp1.data);
                    templist.add(temp2.data);
                    ans.add(templist);
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum1(int target, Node head) {
        Node temp=head;
        Node i=head;
        Node j=head;
        while(j.next!=null){
            j=j.next;
        }
        
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        while(i!=j){
            if(i.data+j.data>target){
                j=j.prev;
            }
            else if(i.data+j.data<target){
                i=i.next;
            }
            else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i.data);
                list.add(j.data);
                ans.add(list);
                j=j.prev;
            }
        }
        return ans;
    }
}
