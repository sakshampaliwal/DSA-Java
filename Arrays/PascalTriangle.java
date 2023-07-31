import java.util.ArrayList;

public class PascalTriangle{
    public static int fact(int no){
        int mul=1;
        while(no>0){
            mul=mul*no;
            no--;
        }
        return mul;
    }
    public static int fun1(int n,int r){
        int ans=fact(n-1)/(fact(n-r)*fact(r-1));
        return ans;
    }
    public static ArrayList<Long> fun2(int n){
        ArrayList<Long> list=new ArrayList<Long>();
        n = n-1;
        long ans=1;
        list.add(ans);
        for(int i=0;i<n;i++){
            ans=ans*(n-i)/(i+1);
            list.add(ans);
        }
        return list;
    }
    public static ArrayList<Long> rowgenerator(int n){
        ArrayList<Long> list=new ArrayList<Long>();
        n = n-1;
        long ans=1;
        list.add(ans);
        for(int i=0;i<n;i++){
            ans=ans*(n-i)/(i+1);
            list.add(ans);
        }
        return list;
    }
    public static ArrayList<ArrayList<Long>> fun3(int n){
        ArrayList<ArrayList<Long>> ans=new ArrayList<ArrayList<Long>>();
        for(int i=1;i<=n;i++){
            ans.add(rowgenerator(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans=fun1(4, 3);
        System.out.println(ans);
        System.out.println(fun3(6));
    }
}