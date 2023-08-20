import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void fun(int[] original,int index,List<Integer> temp,List<List<Integer>> result){
        if(index==original.length){
            result.add(new ArrayList(temp));
            return;
        }
        temp.add(original[index]);
        fun(original,index+1,temp,result);
        temp.remove((temp.size())-1);
        fun(original,index+1,temp,result);
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        fun(nums,0,temp,result);
        System.out.println(result);
    }
}
