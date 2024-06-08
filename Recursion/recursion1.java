package Recursion;

import java.util.ArrayList;

// import Arrays2D.arraylist;

public class recursion1 {
    public static void main(String[] args) {

        // int[] arr ={2,4,59,7,9,12,59,30,35,46,59,68,73,59,95}; 
        // System.out.println(BS(arr, 73, 0, arr.length-1));

        // System.out.println(fibo(4));
        // for (int i = 0; i < 11; i++) {
        //     System.out.println(fibonacciByFormula(i));
        // }

        // System.out.println(LS(arr, 59, 0));
        // LS_AllIndex(arr, 59, 0);
        // System.out.println(LS_AllIndex2(arr, 46, 0));
        // System.out.print(lst);

        int[] arr1 = {4,5,6,7,8,1,2,3};

        System.out.println(rotatedBS(arr1, 9, 0, arr1.length-1));








    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    
    static int fibonacciByFormula(int n){
        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n) ) / Math.sqrt(5)); 

        // double ans = Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5);
        // return ans;

    }


    static int BS(int[] arr , int target , int s , int e ){
        if (s>e){
            return -1;
        }
        int m = s + (e-s) / 2;

        if(arr[m]==target){
            return m;
        }
        else if(arr[m]>target){
            return BS(arr, target, s, m-1);
        }
        return BS(arr, target, m+1, e);
        
    }

    static int rotatedBS(int[] arr,int target, int s,int e){
        if (s>e) {
            return -1;
        }
        int m = s + (e-s) / 2;

        if (target==arr[m]) {
            return m;
        }

        if (arr[s]<=arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return rotatedBS(arr, target, s, m-1);
            }
            else{
                return rotatedBS(arr, target, m+1, e);
            }
        }
        if (target >= arr[m] && target<= arr[e]) {
            return rotatedBS(arr, target, m+1, e);
        }

        return rotatedBS(arr, target, s, m-1);  
    }


    static boolean LS(int[] arr, int target,int i){
        if(i == arr.length){
            return false;
        }
        return arr[i]==target || LS(arr, target, i+1);
    }

    static ArrayList<Integer> lst = new ArrayList<>();

    static void LS_AllIndex(int[] arr, int target,int i){
        if(i == arr.length){
            return;
        }
        if(arr[i]==target){
            lst.add(i);
        }
        LS_AllIndex(arr, target, i+1);
    }

    
    static ArrayList<Integer> LS_AllIndex2(int[] arr, int target,int i){

        ArrayList<Integer> ans = new ArrayList<>();
        if(i == arr.length){
            return ans;
        }
        if(arr[i]==target){
            ans.add(i);
        }
        ArrayList<Integer> belowAns = LS_AllIndex2(arr, target, i+1);
        ans.addAll(belowAns);
        return ans;
    }
}
