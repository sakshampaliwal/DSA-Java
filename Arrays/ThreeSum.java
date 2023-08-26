import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> fun1(int[] arr){
        int n=arr.length;
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int sum=arr[i]+arr[j]+arr[k];
                    List<Integer> templist=new ArrayList<>();
                    if(sum==0 ){
                        templist.add(arr[i]);
                        templist.add(arr[j]);
                        templist.add(arr[k]);
                    }
                    if((templist.size()!=0) && (!list.contains(templist))){
                        list.add(templist);
                    }
                }
            }
        }
        return list;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(fun1(nums));
    }
}
