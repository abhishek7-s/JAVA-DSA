package Searching;

public class BinarySearching {

    static int OrderAgnosticBS(int[] arr, int target) {

        // int[] arr={2,5,8,12,15,19,25,27,28,35,39,45,56,68,79};
        // int[] arr1={99,95,86,82,72,71,63,59,55,51,49,45,43,5};

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end]; // It will check wheather the array is in ascending or not

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // This will common for both situation
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                // If the array is in ascending order then the following algorith will work
                if (target < arr[mid]) {
                    end = mid - 1; // if element at index'mid' is greater then target,Then end will change & become
                                   // 'mid-1' index
                } else {
                    start = mid + 1;
                }
            } else {
                // If the array is in descending order then the following algorith will work

                if (target > arr[mid]) {
                    // As it will descendinng order array
                    end = mid - 1; // if target is greater then element at 'mid' then end will change & become
                                   // 'mid-1'
                } else {
                    start = mid + 1;
                }

            }
        }
        return -1;
    }

    static int binarysearch(int[] arr, int target) {
        // arr={2,5,8,12,15,19,25,27,28,35,39,45,56,68,79};

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 15, 19, 39, 45, 56, 68, 79 };
        int[] arr1 = { 99, 95, 86, 82, 55, 51, 49, 45, 43, 5 };

        int ans = binarysearch(arr, 35); // It works only in ascending order

        int ans1 = OrderAgnosticBS(arr1, 45); // It will work on both in ascending & descending order
        System.out.println(ans1);
    }
}
