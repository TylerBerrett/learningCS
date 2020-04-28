import java.util.*;

public class SingleNumber {

    public static void main(String[] args) {
        int[] test1 = {2,2,1};
        int[] test2 = {4,1,2,1,2};
        System.out.println(singleNumber(test1));
        System.out.println(singleNumber(test2));
    }

    // Solution for https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/549/
    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        Integer[] fin = set.toArray(new Integer[0]);
        return fin[0];
    }
}
