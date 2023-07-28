public class BestTimeBuyStock {
    public static int fun1(int arr[]) {
        int profit = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int tempro = arr[i] - min;
            profit = Math.max(profit, tempro);
            min = Math.min(min, arr[i]);
        }
        return profit;
    }

    public static int fun2(int arr[]){
       int min=Integer.MAX_VALUE;
       int profit=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]<min)
           {
               min=arr[i];
           }
           else if((arr[i]-min)>profit)
           {
               profit=arr[i]-min;
           }
       }
       return profit;

    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int ans=fun1(arr);
        System.out.println(ans);
    }
}
