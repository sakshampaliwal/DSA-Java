public class LongestPallindromeSubstring {
    public boolean check(String substr){
        StringBuilder a=new StringBuilder(substr);
        a=a.reverse();
        if(substr.equals(a.toString())){
            return true;
        }
        return false;
    }
    public String longestPalindrome(String s) {
        String ans="";
        String substr="";
        int max=0;
        boolean res=false;
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=i;j--){
                substr=s.substring(i,j+1);
                res=check(substr);
                if(res==true){
                    if(max!=Integer.max(max,substr.length())){
                        max=Integer.max(max,substr.length());
                        ans=substr;
                    }
                }
            }
        }
        return ans;
    }
}
