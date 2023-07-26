import java.util.HashMap;
public class Longest_Subarray_with_sum_k {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1,4,2,3};
        int sum=0;
        int tofind=2;
        int max=0;
        int rem=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==tofind){
                max=Math.max(max, i+1);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
            rem=sum-tofind;
            if(map.containsKey(rem)){
                max=Math.max(max, i-map.get(rem));
            }
        }
        System.out.println(max);
    }
}

