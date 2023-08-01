import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement_NByThree {
    public static ArrayList<Integer> fun1(int[] arr){
        int n=arr.length;
        int times=(int) n/3;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>times){
                if(!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }
            if(list.size()==2){
                break;
            }
        }
        return list;
    }
    public static List<Integer> fun2(int[] arr) {
        int n=arr.length;
        int times=(int) n/3;
        int count=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int c=map.getOrDefault(arr[i],0);
            map.put(arr[i],c+1);
            if(map.get(arr[i])>times && (!list.contains(arr[i]))){

                list.add(arr[i]);
            }
            if(list.size()==2) break;
        }
        return list;
    }

    // Optimal Approach(Moore's Voting):
    public static List<Integer> fun3(int[] arr) {
        int n=arr.length;
        int c1=0;
        int c2=0;
        int el1=0;
        int el2=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(c1==0 && arr[i]!=el2){
                c1++;
                el1=arr[i];
            }
            else if(c2==0 && arr[i]!=el1){
                c2++;
                el2=arr[i];
            }
            else if(arr[i]==el1){
                c1++;
            }
            else if(arr[i]==el2){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        
        int count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el1){
                count1++;
            }
            else if(arr[i]==el2){
                count2++;
            }
        }
        if(count1>n/3){
            list.add(el1);
        }
        if(count2>n/3){
            list.add(el2);
        }
        return list;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        System.out.println(fun1(nums));
    }
}
