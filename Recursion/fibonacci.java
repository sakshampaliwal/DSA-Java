public class fibonacci {
    public static int fun(int n){
        if(n<=1){
            return n;
        }
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        int ans=fun(4);
        System.out.println(ans);
    }
}
