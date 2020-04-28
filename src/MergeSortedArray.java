import java.util.*;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] one = {4, 5, 6, 0, 0, 0};
        int[] two = {1, 2, 7};
        MergeSortedArray.merge(one, two.length, two, two.length);
        System.out.println(Arrays.toString(one));
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = nums1.length - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
