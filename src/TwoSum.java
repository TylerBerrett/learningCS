import java.util.*;
public class TwoSum {

    public static void main(String[] args) {
        int[] test = {2, 7, 11, 15};
        int testTarget = 9;
        System.out.println(Arrays.toString(TwoSum.twoSum(test, testTarget)));
    }
    // Solution for https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return nums;
    }
}
