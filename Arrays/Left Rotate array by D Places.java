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