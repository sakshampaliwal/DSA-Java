import java.util.HashMap;

public class IsomorphicString {
    public boolean fun(String str1, String str2) {
        if(str1==null || str2==null || str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();

        for(int i=0;i<str1.length();i++){
            if(map.containsKey(str1.charAt(i))){
                if(map.get(str1.charAt(i))!=str2.charAt(i)){
                    return false;
                }
            }
            else{
                if(map.containsValue(str2.charAt(i))){
                    return false;
                }
                map.put(str1.charAt(i),str2.charAt(i));
            }
        }
        return true;
    }
}
