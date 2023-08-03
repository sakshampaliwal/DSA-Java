public class SubarrayWithXOR_K {
    public static int fun1(int []arr, int n) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            int xor=0;
            for(int j=i;j<arr.length;j++){
                xor=xor^arr[j];
                if(xor==n){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2};
        System.out.println(fun1(arr,2));
    }
}
