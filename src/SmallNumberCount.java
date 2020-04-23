import java.util.*;

// Solution for https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
class Solution {


    public static void main(String[] args) {
        int[] nums1 = {8,1,2,2,2,3,1};
        int[] nums = {7,7,7,7};
        System.out.println(Arrays.toString(Solution.smallerNumbersThanCurrent(nums1)));
    }


    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // initial thought would be n ^ 2 double loop and check 
        // keep track in like a hash map   

        // what if we sort it and go through each one if its greater then the last
        // add that amount of smaller numbers to it. 2n(log n)
        // keep track in hash map

        // just skip duplicates when adding to map

        int[] finalNums = nums.clone();
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }
        for (int j = 0; j < nums.length; j++) {
            finalNums[j] = map.get(finalNums[j]);
        }

        return finalNums;
    }
}