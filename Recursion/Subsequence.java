import java.util.ArrayList;

public class Subsequence {
    public static void fun(String original,int index,String temp,ArrayList<String> result){
        if(index==original.length()){
            result.add(temp);
            return;
        }
        
        temp=temp+original.charAt(index);
        fun(original,index+1,temp,result);
        temp=temp.substring(0, temp.length()-1);
        fun(original,index+1,temp,result);
    }
    public static void main(String[] args) {
        String str="geek";
        ArrayList result=new ArrayList<>();
        String temp="";
        fun(str,0,temp,result);
        System.out.println(result);
    }
}
