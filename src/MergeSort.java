import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {
        int[] test = {38, 27, 43, 3, 9, 82, 10};
        MergeSort.sort(test);
        System.out.println(Arrays.toString(test));
    }

    public static void sort(int[] list) {
        if (list.length < 2) {
            return;
        }
        int leftSize = (1 + list.length) / 2;
        int rightSize = list.length - leftSize;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        for (int i = 0; i < list.length; i++) {
            if (i < leftSize) {
                left[i] = list[i];
            } else {
                right[i - leftSize] = list[i];
            }
        }
        sort(left);
        sort(right);
        merge(list, left, right);
    }

    private static void merge(int[] list, int[] left, int[] right) {
        int l = left.length;
        int r = right.length;
        int i = 0, j = 0, k = 0;
        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                list[k++] = left[i++];
            } else {
                list[k++] = right[j++];
            }
        }
        while (i < l) {
            list[k++] = left[i++];
        }
        while (j < r) {
            list[k++] = right[j++];
        }

    }
}