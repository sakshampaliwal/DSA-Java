public class Consecutive_Sequence {
    static boolean linsearch(int arr[],int tosearch){
        int i=0;
        while(i<arr.length){
            if(arr[i]==tosearch){
                return true;
            }
            i++;
        }
        return false;
    }
    // Brute Approach(TLE error may occur):
    static int fun1(int arr[],int n){
        int max=1;
	   for(int i=0;i<n;i++){
	       int count=1;
	       int x=arr[i];
	       while(linsearch(arr,x+1)==true){
	           count++;
	           x=x+1;
	       }
	       max=Math.max(max,count);
	   }
	   return max;
    }
    static int fun2(int arr[],int n){
        
    }
    public static void main(String[] args) {
        int arr[] = {2,6,1,9,4,5,3};
        int ans=fun1(arr, 7);
        System.out.println(ans);
    }
}
