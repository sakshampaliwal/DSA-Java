public class LargestOddNumberString{
    public static String fun(String num) {
        int len=num.length()-1;
        for(int i=len;i>=0;i--){
            if(num.charAt(i)%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String ans=fun("123456");
        System.out.println(ans);
    }
}