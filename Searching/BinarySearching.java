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

        // If the array is in ascending order then the following algorith will work
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1; // if element at index'mid' is greater then target,Then end will change & become
                                   // 'mid-1' index
                } else {
                    start = mid + 1;
                }
            }
        // If the array is in descending order then the following algorith will work
             else {

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

    static int ceilingBS(int[] arr,int target){
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
        return start; // If we want to find floor of given array we will return "end"

    }

    static int[] FirstLastPosition(int[]arr , int target){
        int[] ans = {-1,-1};

        ans[0] =searcher(arr, target, true);
        ans[1] =searcher(arr, target, false);
        return ans;
    }
    
    static int searcher(int[]arr ,int target , boolean tofindStartIdx){
       int ans =-1;
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(target <arr[mid]){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start =mid+1;
            }
            else{
                ans=mid;
                if(tofindStartIdx){
                    end = mid - 1;
                } 
                else{
                    start = mid+1;
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        //int[] arr = { 2, 5, 8, 12, 15, 19, 39, 45, 56, 68, 79 };
        // int[] arr1 = { 99, 95, 86, 82, 55, 51, 49, 45, 43, 5 };
        int[]arr2 ={5,7,9,9,9,10,12,15,15};

        // int ans = binarysearch(arr, 35); // It works only in ascending order
        // int ans1 = OrderAgnosticBS(arr1, 45); // It will work on both in ascending & descending order
        // System.out.println(ans1);
        // System.out.println(ceilingBS(arr, 53));
        System.out.println(FirstLastPosition(arr2, 15));
    }
}
