package Searching;

import java.util.Arrays;

public class BInarySearchingIn2D {

    static int[] bsIn2D(int[][] arr, int target) {

        /*
            Binary search for 2d array is done by checking last element of row i.e arr[r][c]
             if the target is greater then the last element then it will increase row by 1 
             else it will decrease coloum by 1 as the target will be smaller then last element 

             Note :- array should be sorted in row wise and coloum wise 
             For eg:-

                        int[][] arr =  {
                                            { 12, 18, 19 },
                                            { 15, 18, 21 },
                                            { 20, 24, 25 },
                                            { 29, 56, 96 }
                                        };
         
         */
          
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
                { 29, 56, 96, 97 }
        };

        System.out.println(Arrays.toString(bsIn2D(arr, 56)));
    }
}
