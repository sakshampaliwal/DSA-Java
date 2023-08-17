import java.util.Stack;

public class MaxDepthOfParenthesis {
    public int maxDepth(String s) {
        int len=s.length();
        int count=0;
        int max=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            max=Math.max(count,max);
        }
        return max;
    }
    public int maxDepth1(String s) {
        Stack<Character> st=new Stack<>();
        int max=0;
        for(char i: s.toCharArray()){
            if(i=='('){
                st.push('(');
                max=Integer.max(max,st.size());
            }
            else if(i==')'){
                st.pop();
            }
        }
        return max;
    }
}
