// Link: https://practice.geeksforgeeks.org/problems/missing-number4257/1
// Missing Number

//Brute:
class Compute {
    
    public static int missingNumber(int A[], int N)
    {
        for(int i=1;i<=N;i++){
            int flag=0;
            for(int j=0;j<N-1;j++){
                if(A[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }
}



