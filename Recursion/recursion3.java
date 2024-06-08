package Recursion;

import java.util.ArrayList;

public class recursion3 {
    public static void main(String[] args) {
        int arr[] = {1,2,7,5,7,4,4,7,15};
        // boolean rs = sortedOrNot(arr, 0);
        // System.out.println(rs);

        // System.out.println(LSByrecurr(arr, 7, 0));

        // multiLSByrecurr(arr, 7, 0);
        // System.out.println(list);

        // ArrayList<Integer> list1 = new ArrayList<>();
        // multiLSByrecurrList(arr, 7, 0, list1);
        // System.out.println(list1);

        System.out.println(AllIndex(arr , 7 , 0));

    }

    static boolean sortedOrNot(int[] arr , int n){
        if (n == arr.length-1) {
            return true;
        }
        return arr[n] <= arr[n+1] && sortedOrNot(arr, n+1); 
    }

    static int LSByrecurr(int[] arr , int target , int n){
        if(n >= arr.length){
            return -1;
        }
        if (arr[n] == target) {
            return n;
        }
        return LSByrecurr(arr, target, n+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void multiLSByrecurr(int[] arr , int target , int n){
        if(n == arr.length){
            return;
        }
        if (arr[n] == target) {
            list.add(n);
        }
        multiLSByrecurr(arr, target, n+1);
    }

    //doing same thing as above but in this we will return an arraylist by using recursion
    static ArrayList<Integer> multiLSByrecurrList(int[] arr , int target , int n , ArrayList<Integer> list){
        if(n == arr.length){
            return list;
        }
        if (arr[n] == target) {
            list.add(n);
        }
        return multiLSByrecurrList(arr, target, n+1 , list);
    }



    //Promble : we have to return an Arraylist without taking AL(Arraylist) as an parameter , we have to create an list in the body of function
    
    static ArrayList<Integer> AllIndex(int[] arr , int target , int n){
        ArrayList<Integer> list = new ArrayList<>();
        if(n == arr.length){
            return list;
        }
        if (arr[n] == target) {
            list.add(n);
        }
        ArrayList<Integer> ans = AllIndex(arr, target, n+1);
        list.addAll(ans);
        
        return list;

    } 
}
