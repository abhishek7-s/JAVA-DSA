package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CycleSort {

    static int[] CycleSorting(int[] arr){

        /*
         * In cycle sort we take i th element and put it on index that is smaller by 1
         * NOTE:- Array should be from 1 to n 
         */


        int i = 0;
        
        while(i < arr.length){
            int correctIDX = arr[i]-1;    
            if(arr[i] != arr[correctIDX]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correctIDX];
                arr[correctIDX] = temp;
            }
            else{ 
                i++;
            }

        }
        return arr;
    }

    static int MissingNum(int[]arr){
        int i = 0;
    
        while(i < arr.length){
             int correctIDX = arr[i];    
             if(arr[i] < arr.length && arr[i] != arr[correctIDX]){
                 //swap
                 int temp = arr[i];
                 arr[i] = arr[correctIDX];
                 arr[correctIDX] = temp;
             }
             else{ 
                 i++;
             }
    
        }
        //searching the missing element in array
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == index){
                continue;
            }
            else{
                return index;
            }
        }
        return arr.length;
    }    

    static List<Integer> AllMissingNum(int[] arr){
        int i = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>(arr.length); 

        while(i < arr.length){
            int correctIDX = arr[i]-1;    
            if(arr[i] != arr[correctIDX]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correctIDX];
                arr[correctIDX] = temp;
            }
            else{ 
                i++;
            }

        }
        //searching all the missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == index+1){
                continue;
            }
            else{
                ans.add(index+1);
            }
        }
        return ans;
    }

    static int DuplicateNum(int[] arr){
        int i = 0;
        
        while(i < arr.length){
            int correctIDX = arr[i]-1;    
            if(arr[i] != arr[correctIDX]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correctIDX];
                arr[correctIDX] = temp;
            }
            else{ 
                i++;
            }

        }
        for (int index = 0; index < arr.length; index++) {
            int ans = arr[index];
            if(arr[index] == index+1){
                continue;
            }
            else{
                return ans;
            }
            
        }
        return -1;
    }

    static List<Integer> AllDuplicateNum(int[] arr){
        int i = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>(1);
        while (i < arr.length){
            if (arr[i] != arr[arr[i]-1]) {
                //swap
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1 ){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    public static void main (String[] Args){

        int arr[] = {4,3,2,7,8,2,3,1};
        // CycleSorting(arr);     
        System.out.println(Arrays.toString(arr));

        // System.out.println(MissingNum(arr)+" is the missing number");
        // System.out.println(AllMissingNum(arr));
        // System.out.println(DuplicateNum(arr));
        // System.out.println(AllDuplicateNum(arr));
        // System.out.println(arr[arr[i]-1]);

        
    }
}
