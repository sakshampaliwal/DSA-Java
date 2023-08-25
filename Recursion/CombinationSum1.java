import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void fun(int index, int sum, List<Integer> temp, List<List<Integer>> result, int[] original) {
        if (sum == 0) {
            result.add(new ArrayList(temp));
            return;
        }
        if (index == original.length || sum < 0) {
            return;
        }
        temp.add(original[index]);
        fun(index, sum - original[index], temp, result, original);
        temp.remove(temp.size() - 1);
        fun(index + 1, sum, temp, result, original);
    }

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        fun(0, target, temp, result, candidates);
        System.out.println(result);
    }
}
