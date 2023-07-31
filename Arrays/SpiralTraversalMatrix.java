import java.util.ArrayList;

public class SpiralTraversalMatrix {
    public static ArrayList<Integer> fun1(int[][] arr){
        ArrayList<Integer> list=new ArrayList<>();
        int rows=arr.length;
        int cols=arr[0].length;
        int left=0;
        int right=cols-1;
        int top=0;
        int bottom=rows-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> ans=fun1(matrix);
        System.out.println(ans);
    }
}
