package video.binary_search;

import org.junit.jupiter.api.Test;

public class Page3pro {
    @Test
    public void test() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = binarySearch(arr, 5);
        System.out.println(i);
    }

    private static int binarySearch(int[] arr, int target) {
        return binarySearchHelper(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchHelper(int[] arr, int target, int left, int right) {
        if (right - left <= 1) {
            if (arr[left] == target) {
                return left;
            } else if (arr[right] == target) {
                return right;
            } else {
                return -1;
            }
        }

        int m = (left + right) / 2;

        if (target < arr[m]) {
            return binarySearchHelper(arr, target, left, m);
        } else {
            return binarySearchHelper(arr, target, m, right);
        }
    }
}
