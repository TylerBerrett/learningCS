import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] test = {1,2};
        rotate(test, 3);
        //System.out.println(rotate(test, 3));

    }
    // Solution for https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
    public static void rotate(int[] nums, int k) {
        int[] fin = new int[nums.length];

        if (k > nums.length) {
            k = k % nums.length;
        }

        int t = 0;
        for (int i = nums.length - k; i < nums.length; i++, t++) {
            fin[t] = nums[i];
        }
        for (int j = 0; j < nums.length - k; j++, t++) {
            fin[t] = nums[j];
        }

        for (int l = 0; l < nums.length; l++) {
            nums[l] = fin[l];
        }



        System.out.println(Arrays.toString(nums));
    }

}
