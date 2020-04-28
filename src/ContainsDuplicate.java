import java.util.*;
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] test1 = {1,2,3,4};
        int[] test2 = {1,2,1,4};
        System.out.println(containsDuplicate(test1));
        System.out.println(containsDuplicate(test2));
    }

    // Solution for https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/578/
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
