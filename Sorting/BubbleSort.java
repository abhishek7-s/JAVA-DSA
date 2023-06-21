package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void printIt(int arr[]) {
        // Print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int[] arr1 = { 1,2,3,4,5,6,7,8,9 };
        boolean hasSwapped = false;

        
        for (int turn = 0; turn < arr1.length - 1; turn++) {
            
            // Loop will go on each (index - turn)
            for (int i = 0; i < arr1.length-1 - turn; i++) {
                //Swap
                if (arr1[i] > arr1[i + 1]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;
                    hasSwapped =true;
                }
            }
            if(!hasSwapped){
                break;
            }
        }
        // printIt(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
