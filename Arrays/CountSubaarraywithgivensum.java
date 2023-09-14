public class CountSubaarraywithgivensum {
    public static int fun1(int[] arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1};
        int ans=fun1(nums, 2);
        System.out.println(ans);
    }
}
