//Link: https://practice.geeksforgeeks.org/problems/quick-left-rotation3806/1
// Given an array arr[] of size N and an integer K, the task is to left rotate the array K indexes

class Solution
{
    void leftRotate(long arr[], int k,int n)
    {
        if(n==0){
            return;
        }
        int d=k%n;
        if(d==0){
            return;
        }
        
        long[] temp=new long[d];
        //Copying first d elements in this temp
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        //Shifting Elements
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        //Adding temp now
        int j=0;
        for(int i=n-d;i<n;i++){
            arr[i]=temp[j];
            j++;
        }
    }
}
// The above apprach may lead time exceed error, so try below approach
//Optimal "Reversal Algorithm:"
// Step 1: Reverse the subarray with the first d elements (reverse(arr, arr+d)).
// Step 2: Reverse the subarray with the last (n-d) elements (reverse(arr+d, arr+n)).
// Step 3: Finally reverse the whole array (reverse(arr, arr+n)).

class Solution1{
    void reverse(long arr[],int start,int end){
        while(start<=end){
            long temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    void leftRotate1(long arr[],int k, int n){
        if(n==0){
            return;
        }
        int d=k%n;
        if(d==0){
            return;
        }
        //First time reverse
        reverse(arr, 0, d-1);

        //Second time
        reverse(arr, d, n);

        //Third time
        reverse(arr, 0, n-1);
    }
}