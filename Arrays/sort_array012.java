import java.util.Arrays;

public class sort_array012 {
    // Optimal Approach(Dutch National Flag algo)
    public static void fun1(int arr[]){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,1,2,1,0,0,0,2,1,0,1,0,1};
        fun1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
