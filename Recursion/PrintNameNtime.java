public class PrintNameNtime{
    public static void fun1(String name,int n){
        if(n==1){
            System.out.println(name);
            return;
        }
        fun1(name,n-1);
        System.out.println(name);
    }
    public static void main(String[] args) {
        String name="Sam";
        fun1(name, 5);
    }
}