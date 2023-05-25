// Link: https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
// Remove duplicate elements from sorted Array


class Solution {
    int remove_duplicate(int A[],int N){
        int i=0;
        for(int j=1;j<N;j++){
            if(A[j]!=A[i]){
                i++;
                A[i]=A[j];
            }
        }
        return i+1;
    }
}