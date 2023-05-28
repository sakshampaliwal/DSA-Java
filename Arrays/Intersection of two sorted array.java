//Link: https://www.codingninjas.com/codestudio/problems/intersection-of-2-arrays_1082149?leftPanelTab=0
//Intersection Of Two Sorted Arrays

//Brute:
public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		int vis[]=new int[m];
		ArrayList<Integer> answer = new ArrayList<Integer>(n);
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(arr1.get(i)==arr2.get(j) && vis[j]==0){
					answer.add(arr1.get(i));
					vis[j]=1;
					break;
				}
				else{
					if(arr1.get(i)<arr2.get(j))break;
				}
			}
		}
		return answer;
	}
}

//Optimal:

public class Solution1
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		ArrayList<Integer> answer=new ArrayList<>(n);
		int i=0;
		int j=0;
		while(i<n && j<m){
			if(arr1.get(i)<arr2.get(j)){
				i++;
			}
			else if(arr1.get(i)>arr2.get(j)){
				j++;
			}
			else{
				answer.add(arr1.get(i));
				i++;
				j++;
			}
		}
		return answer;
	}
}