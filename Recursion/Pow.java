public class Pow {
    public static double fun(double x,int n){
        if(n==0){
            return 1;
        }
        x=x*fun(x,n-1);
        return x;
    }
    public static double fun1(double x,int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return fun(1/x,-n);
        }
        else if(n%2==0){
            double temp=fun(x,n/2);
            return temp*temp;
        }
        else{
            return x*fun(x,n-1);
        }
    }
    public static void main(String[] args) {
        double ans=fun1(5,-3);
        System.out.println(ans);
    }
}
