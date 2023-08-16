package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){

        /*Selection sorting Algorithm
         *  in this we pick smallest element in array and put it on 
         *  i index as the loop runs i gets i++ as shown in fig
         */

        int[] arr ={5,3,4,1,2};
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i<arr.length-1;i++){
            int min = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            //Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;    
            System.out.println(Arrays.toString(arr));
  
        }

         System.out.println(Arrays.toString(arr));


    }
}
