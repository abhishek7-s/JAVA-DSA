package Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] Args){

        int[] arr = {4,3,5,1,2};

        for (int i = 0; i<arr.length-1;i++){

            for (int j = i+1; j > 0 ; j--) {
               
                if(arr[j-1]>arr[j]){
                    // swap
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
                else{
                    break;
                }
            } 
            

        }
        System.out.println(Arrays.toString(arr));
    }
}
