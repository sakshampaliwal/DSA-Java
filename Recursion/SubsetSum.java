import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {
    public static void fun(int[] original,int index,int temp,ArrayList<Integer> result){
        if(index==original.length){
            result.add(temp);
            return;
        }
        temp=temp+original[index];
        fun(original,index+1,temp,result);
        temp=temp-original[index];
        fun(original,index+1,temp,result);
    }
    public static void main(String[] args) {
        ArrayList<Integer> result=new ArrayList<>();
        int temp=0;
        int[]num={1,2,3};
        fun(num,0,temp,result);
        Collections.sort(result);
        System.out.println(result);
    }
}
