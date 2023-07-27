import java.util.Arrays;
import java.util.HashMap;

public class Majority_Element {
    //Better Approach using HashMap:
    public static int fun1(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>(arr.length)/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2,1,1};
        int ans;
        ans=fun1(arr);
        System.out.println(ans);

    }
}
