import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {

    static int[] fun1(int[] arr, int tosum) {
        int ans[] = { -1, -1 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == tosum) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    static int[] fun2(int[] arr, int tosum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rem = 0;
        int ans[] = { -1, -1 };
        for (int i = 0; i < arr.length; i++) {
            rem = tosum - arr[i];
            if (map.containsKey(rem)) {
                ans[0] = map.get(rem);
                ans[1] = i;
                return ans;
            }
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            }
        }
        return ans;
    }

    static String fun3(int[] arr, int tosum) {
        // To answer in yes and no Function
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        while (left != right) {
            int sum = arr[left] + arr[right];
            if (sum == tosum) {
                return "YES";
            } else if (sum < tosum) {
                left++;
            } else {
                right--;
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 1, 3, 5, 4, 1, 2, 1 };
        int tofind = 7;
        int answer[] = fun2(arr, tofind);
        System.out.println(Arrays.toString(answer));
    }

}
