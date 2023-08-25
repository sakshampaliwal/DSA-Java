import java.util.ArrayList;
import java.util.List;

public class PhoneNumberPad {
    public static void fun(String original,String temp,int index,List<String> result,String[] arr){
        if(original.length()==temp.length()){
            result.add(temp);
            return;
        }

        String x=arr[(int)(original.charAt(index) - '0')];
        for(int i=0;i<x.length();i++){
            fun(original,temp+x.charAt(i),index+1,result,arr);
        }
    }
    public static void main(String[] args) {
        List<String> result=new ArrayList<String>();
        String digits="257";
        if(digits.length() == 0){
            System.out.println(result);
        }

        String temp="";
        String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        fun(digits,temp,0,result,arr);

        System.out.println(result);
    }
}
