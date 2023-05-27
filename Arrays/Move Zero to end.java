// Link: https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
//Move all zeros to end of array

// Brute Force:
class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        int temp[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
        for(int i=k;i<n;i++){
            arr[i]=0;
        }
    }
}

// Optimal:
class Solution1 {
    void pushZerosToEnd(int[] arr, int n) {
        int j = -1 ;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        
        int i = j+1;
        while(i<arr.length){
            if(j<0){
                break;
            }
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
    }
}