import java.util.ArrayList;

public class Leaders_InArray {
    public static ArrayList fun1(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int check = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    check = 1;
                    break;
                }
            }
            if (check == 0) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static ArrayList fun2(int arr[],int n){
        ArrayList<Integer> list=new ArrayList<Integer>();
            int max=Integer.MIN_VALUE;
            
            for(int i=n-1;i>=0;i--){
               if(max<=arr[i]){
                   list.add(arr[i]);
                   max=arr[i];
               }
            }
            reverse(list);
            return list;
    }

    static void reverse(ArrayList<Integer> list) {
        int i = 0;
        int n = list.size();
        while (i < n / 2) {
            int temp = list.get(i);
            list.set(i, list.get(n - 1 - i));
            list.set(n - 1 - i, temp);
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        ArrayList ans=fun2(arr,6);
        System.out.println(ans);

    }
}
