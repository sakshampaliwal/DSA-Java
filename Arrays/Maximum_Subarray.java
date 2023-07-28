public class Maximum_Subarray {
    // Time Limit Exceeded Error may occur on this:
    public static int fun1(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
    // Optimal Approach ( Kadane's Algorithm)
    public static int fun2(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            max=Math.max(max, sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-2,-1,-3,-4,-1,-2,-1,-5,-4};
        int ans=fun2(arr);
        System.out.println(ans);

    }
}
