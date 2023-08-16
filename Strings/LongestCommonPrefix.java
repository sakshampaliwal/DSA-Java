import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int len=strs.length-1;
        int firstlen=strs[0].length();
        int count=0;
        for(int i=0;i<firstlen;i++){
            if(strs[0].charAt(i)==strs[len].charAt(i)){
                count++;
            }
            else{
                break;
            }
        }
        
        return strs[0].substring(0,count);
    }
    public static void main(String[] args) {
        
    }
}
