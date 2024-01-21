import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateBy90Clock {
    public static void fun1(int arr[][],int n,int answer[][]){
        // int ans[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                answer[j][n-i-1]=arr[i][j];
            }
        }
        // arr=answer;
    }
    public static void fun2(int arr[][]){
        int n=arr[0].length;
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=i;j<n;j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            arr[i]=reverse(arr[i]);
        }
    }
    public static int[] reverse(int[] arr){
        int temp=0;
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int answer[][]=new int[3][3];
        fun1(matrix,3,answer);
        for(int[] i:answer){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
