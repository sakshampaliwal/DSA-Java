public class factorialofNno {
    public static int fun(int n){
        if(n<=1){
            return 1;
        }
        return n*fun(n-1);
    }
    public static void main(String[] args) {
        int ans=fun(3);
        System.out.println(ans);
    }
}
