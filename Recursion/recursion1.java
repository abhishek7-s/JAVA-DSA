package Recursion;

public class recursion1 {
    public static void main(String[] args) {

        // int[] arr ={2,4,6,7,9,12,26,30,35,46,59,68,73,81,95}; 
        // System.out.println(BS(arr, 73, 0, arr.length-1));

        // System.out.println(fibo(4));

        for (int i = 0; i < 11; i++) {
            
            System.out.println(fibonacciByFormula(i));
        }

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
        return BS(arr, target, s+1, e);
        
    }
}
