import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=0;
        for(int i=0;i<s.length();i++){
            if( i<s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                ans=ans-map.get(s.charAt(i));
            }
            else{
                ans=ans+map.get(s.charAt(i));
            }
        }
        return ans;
    }
    public int romanToInt1(String s) {
        int len=s.length();
        char c=' ';
        int ans=0;
        char prev=' ';
        for(int i=0;i<len;i++){
            c=s.charAt(i);
            switch(c){
                case 'I':
                    ans=ans+ 1;
                    break;
                case 'V':
                    ans=ans+ (prev=='I' ? 3:5);
                    break;
                case 'X':
                    ans=ans+ (prev=='I' ? 8:10);
                    break;
                case 'L':
                    ans=ans+ (prev=='X' ? 30:50);
                    break;
                case 'C':
                    ans=ans+ (prev=='X' ? 80:100);
                    break;
                case 'D':
                    ans=ans+ (prev=='C' ? 300:500);
                    break;
                case 'M':
                    ans=ans+ (prev=='C' ? 800:1000);
                    break;
            }
            prev=c;       
        }
        return ans;
    }
}
