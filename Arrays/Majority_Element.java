import java.util.Arrays;
import java.util.HashMap;

public class Majority_Element {
    // Better Approach using HashMap:
    public static int fun1(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > (arr.length) / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    // Moore's Voting Algo(Optimal Approach): 
    public static int fun2(int[] arr) {
        int expected = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == expected) {
                count++;
            } else {
                count--;
            }
            if (count == 0 && i != arr.length - 1) {
                expected = arr[i + 1];
            }
        }
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == expected) {
                check++;
            }
        }
        if (check > arr.length / 2) {
            return expected;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 22, 3, 4, 5, 6, 7 };
        int ans;
        ans = fun2(arr);
        System.out.println(ans);
    }
}
