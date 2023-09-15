public class LongestSubarrayWithZeroSum {
    public static int fun1(int arr[], int n){
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum==0){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int A[] = {15,-2,2,-8,1,7,10,23};

    }
}
