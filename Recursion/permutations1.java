import java.util.ArrayList;
import java.util.List;

public class permutations1 {
    public static void fun(int[] nums, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList(temp));
            return;
        }
        for (int number : nums) {
            if (temp.contains(number)) {
                continue;
            }
            temp.add(number);
            fun(nums, temp, result);
            temp.remove(temp.size() - 1);
        }
    }

    public static void fun1(int[] nums, List<Integer> temp, int index, List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList(temp));
            return;
        }
        if (temp.contains(nums[index])) {
            continue;
        }
        temp.add(nums[index]);
        fun1(nums, temp, index + 1, result);
        temp.remove(temp.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        fun1(nums, temp, result);
        System.out.println(result);
    }
}
