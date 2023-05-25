//Link: https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0
// Given an array A[] of size n. The task is to find the largest element in it.

class Compute {
    
    public int largest(int arr[], int n)
    {
        int large=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return large;
        
    }
}