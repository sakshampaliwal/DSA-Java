public class SetMatrixZero {
    public void fun1(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;
        int x=Integer.MIN_VALUE*1000;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==0){
                    rowminus(arr,i,cols);
                    colminus(arr,j,rows);
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==x){
                    arr[i][j]=0;
                }
            }
        }
    }
    public void rowminus(int arr[][],int rowfixed,int cols){
        for(int i=0;i<cols;i++){
            if(arr[rowfixed][i]!=0){
                arr[rowfixed][i]=Integer.MIN_VALUE*1000;
            }
        }
    }
    public void colminus(int arr[][],int colfixed,int rows){
        for(int i=0;i<rows;i++){
            if(arr[i][colfixed]!=0){
                arr[i][colfixed]=Integer.MIN_VALUE*1000;
            }
        }
    }
    public static void fun2(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;
        int rowcheck[]=new int[cols];
        int colcheck[]=new int[rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==0){
                    rowcheck[j]=1;
                    colcheck[i]=1;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(colcheck[i]==1 || rowcheck[j]==1){
                    arr[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};

    }
}
