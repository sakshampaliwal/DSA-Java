import java.util.Arrays;
import java.util.ArrayList;

public class Rearrange_Element_BySign {
    // Brute Approach:
    public static int[] fun1(int arr[]) {
        ArrayList<Integer> posi = new ArrayList<>();
        ArrayList<Integer> negi = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negi.add(arr[i]);
            } else {
                posi.add(arr[i]);
            }
        }
        int j = 0;
        for (int i = 0; i < posi.size(); i++) {
            arr[2 * j] = posi.get(i);
            arr[2 * j + 1] = negi.get(i);
            j++;
        }
        return arr;
    }

    // Optimal Approach
    public static int[] fun2(int arr[]) {
        int ans[] = new int[arr.length];
        int posi_pointer = 0;
        int negi_pointer = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans[posi_pointer] = arr[i];
                posi_pointer = posi_pointer + 2;
            } else {
                ans[negi_pointer] = arr[i];
                negi_pointer = negi_pointer + 2;
            }
        }
        return ans;
    }
    // DO Again:
    public static int[] fun3(int arr[]){
        int ans[]=new int[arr.length];
        ArrayList<Integer> posi=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posi.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        if(posi.size()>neg.size()){
        for(int i=0;i<neg.size();i++){
                arr[2*i]=posi.get(i);
                arr[2*i+1]=neg.get(i);
        }
        int index=neg.size();
        for(int i=neg.size()*2;i<posi.size();i++){
            arr[i]=posi.get(index);
            index++;
        }
        }
        else{
            for(int i=0;i<posi.size();i++){
                arr[2*i]=posi.get(i);
                arr[2*i+1]=neg.get(i);
        }
        }
        
        for(int i=till;i<arr.length;i++){
            arr[i]=arr[]
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, 3, 4, -3, 1 };
        int[] ans = fun2(arr);
        System.out.println(Arrays.toString(ans));

    }
}
