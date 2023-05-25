// Given an array Arr of size N, print second largest distinct element from an array.
// Link: https://practice.geeksforgeeks.org/problems/second-largest3735/1

class Solution {
    int print2largest(int arr[], int n) {
        int large=Integer.MIN_VALUE;
        int seclarge=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                seclarge=large;
                large=arr[i];
            }
            else if(arr[i]>seclarge && arr[i]!=large){
                seclarge=arr[i];
            }
        }
        if(seclarge==Integer.MIN_VALUE){
            return -1;
        }
        return seclarge;
    }
}