public class SumofFirstNno{
    public static int fun(int n){
        if(n==1){
            return n;
        }
        return n+fun(n-1);
    }
    public static void main(String[] args) {
        int x=fun(5);
        System.out.println(x);
    }
}