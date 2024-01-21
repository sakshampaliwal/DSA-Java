public class ReverseNumber {
    public static int reverse(int num){
        int rem=0;
        int ans=0;
        while(num!=0){
            rem=num%10;
            ans=rem+(ans*10);
            num=num/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a=reverse(432);
        System.out.println(a);
    }
}
