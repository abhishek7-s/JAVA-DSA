package Sorting;
import java.util.Arrays;

public class InsertionSort {

    static void InsertSort(int[] arr){
        for (int i = 0; i <= arr.length-1; i++) {
            int j = i; 
            while (j>0 && arr[j-1]>arr[j]) {
                int temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j]= temp;
                j--;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] Args){

        int[] arr = {4,3,5,1,2};
        
        InsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
