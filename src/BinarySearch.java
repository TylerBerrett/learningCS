class BinarySearch {
    public static void main(String[] args) {
        int[] list =  {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        System.out.println(BinarySearch.search(list, target));
    }

    static int search(int[] list, int target) {
        int left = 0;
        int right = list.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == list[mid]) {
                return mid;
            }
            else if (target > list[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }



        return index;
    }
}
