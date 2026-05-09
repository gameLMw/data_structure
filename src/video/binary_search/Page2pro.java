package video.binary_search;

import org.junit.jupiter.api.Test;

public class Page2pro {
    @Test
    public void test() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = binarySearch(arr, 2);
        System.out.println(i);
    }

    private static int binarySearch(int[] arr, int target) {
        return binarySearchHelper(arr, target, 0, arr.length);
    }

    private static int binarySearchHelper(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int m = (left + right) / 2;
        int result = 0;

        if (arr[m] == target) {
            result = m;
        } else if (target > arr[m]) {
            result = binarySearchHelper(arr, target, m + 1, right);
        } else if (target < arr[m]) {
            result = binarySearchHelper(arr, target, left, m);
        }
        return result;
    }
}
