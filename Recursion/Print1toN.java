public class Print1toN {
    public static void fun1(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        fun1(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        fun1(6);
    }
}
