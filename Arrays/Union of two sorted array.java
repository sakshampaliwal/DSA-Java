//Link: https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
//Union of Two Sorted Arrays

//Brute Force:

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        //Below we use treeset because HashSet data structure does not guarantee any specific order of elements. It stores elements in a way that allows for efficient retrieval and eliminates duplicates
        TreeSet<Integer> union_set = new TreeSet<>();
        for(int i=0;i<n;i++){
            union_set.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            union_set.add(arr2[i]);
        }
        ArrayList<Integer> union = new ArrayList<>();
        for(int it:union_set){
            union.add(it);
        }
        return union;
    }
}