package Searching;

public class BinarySearching {

    static int binarysearch(int[] arr , int target){
        int start =0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start +(end-start)/2;
       
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,5,8,12,15,19,25,27,28,35,39,45,56,68,79};
        int ans = binarysearch(arr, 35);
        System.out.println(ans);
    }
}
