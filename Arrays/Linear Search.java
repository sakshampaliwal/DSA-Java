//Link: https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1
// Searching an element in a sorted array

class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        for(int i=0;i<N;i++){
            if(arr[i]==K){
                return 1;
            }
        }
        return -1;
    }
}