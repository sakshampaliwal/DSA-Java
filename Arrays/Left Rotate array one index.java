//Left Rotate Array by 1 Place

class Solution
{
    void leftRotate(long arr[], int k,int n)
    {
        temp=arr[0];
        for (int i = 1; i < n; i++) {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
}