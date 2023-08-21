import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsII {
    public static void fun(int[] original,int index,List<Integer> temp,List<List<Integer>> result){
        if(index==original.length){
            if(!result.contains(temp)){
                result.add(new ArrayList(temp));
            }
            return;
        }
        temp.add(original[index]);
        fun(original,index+1,temp,result);
        temp.remove(temp.size()-1);
        fun(original,index+1,temp,result);
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        fun(nums,0,temp,result);
        System.out.println(result);
    }
}
