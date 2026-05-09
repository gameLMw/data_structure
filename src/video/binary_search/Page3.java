package video.binary_search;

import org.junit.jupiter.api.Test;

/*
 * 二分查找（第三版）
 * 1，2，3版中3最快
 * */

public class Page3 {
    @Test
    public void test() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//                ,11,12,13,14,15,16,17,18,19,20
//                ,21,22,23,24,25,26,27,28,29,30
//                ,31,32,33,34,35,36,37,38,39,40
//                ,41,42,43,44,45,46,47,48,49,50
//                ,51,52,53,54,55,56,57,58,59,60
//                ,61,62,63,64,65,66,67,68,69,70
//                ,71,72,73,74,75,76,77,78,79,80
//                ,81,82,83,84,85,86,87,88,89,90
//                ,91,92,93,94,95,96,97,98,99,100
        };
        int i = binarySearch(arr, 10);
        System.out.println(i);
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int num = 0;

        while (1 < right - left) {
            num++;
            int m = (left + right) / 2;
            if (target < arr[m]) {
                right = m;
            } else {
                left = m;
            }
        }
        if (arr[left] == target) {
            System.out.println("num:" + num);
            return left;
        } else {
            System.out.println("num:" + num);
            return -1;
        }
    }
}

