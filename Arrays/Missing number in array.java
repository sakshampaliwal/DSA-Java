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


//Better
//Using Hashing Technique:

class Compute1 {
    
    public static int missingNumber(int A[], int N)
    {
        int hash[]=new int[N+1];
        for(int i=0;i<N-1;i++){
            hash[A[i]]=1;
        }
        for(int i=1;i<N+1;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
}

//Optimal:
//Sum

class Compute2 {
    public static int missingNumber(int A[], int N)
    {
        int sum=0;
        int ExpectedSum=0;
        for(int i=0;i<N;i++){
         sum=sum+A[i];   
        }
        ExpectedSum=(N*(N+1))/2;
        return ExpectedSum-sum;
    }
}