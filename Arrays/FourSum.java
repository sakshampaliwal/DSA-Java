import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fun1(int[] arr, int target){
        int n=arr.length;
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        long sum=(long)arr[i]+arr[j]+arr[k]+arr[l];
                        List<Integer> templist=new ArrayList<>();
                        if(sum==target){
                            templist.add(arr[i]);
                            templist.add(arr[j]);
                            templist.add(arr[k]);
                            templist.add(arr[l]);
                        }
                        if((templist.size()!=0) && (!list.contains(templist))){
                            list.add(templist);
                        }
                    }
                    
                }
            }
        }
        return list;
    }

    public List<List<Integer>> fun2(int[] arr, int target) {
        int n=arr.length;
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                HashSet<Integer> set=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    int rem=target - (arr[i]+arr[j]+arr[k]);
                    if(set.contains(rem)){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(rem);
                        if(!list.contains(temp)){
                            list.add(temp);
                        }
                    }
                    set.add(arr[k]);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(fun1(nums,0));
    }
}
