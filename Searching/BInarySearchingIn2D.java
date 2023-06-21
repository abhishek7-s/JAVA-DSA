package Searching;

import java.util.Arrays;

public class BInarySearchingIn2D {

    static int[] bsIn2D(int[][] arr, int target) {
        int r = 0;
        int c = arr.length-1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[] { r, c };
            }
            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 12, 18, 19, 26 },
                { 15, 18, 21, 23 },
                { 20, 24, 25, 27 },
                { 29, 56, 86, 96 }
        };

        System.out.println(Arrays.toString(bsIn2D(arr, 96)));
    }
}
