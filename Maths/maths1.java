package Maths;

public class maths1 {
    public static void main(String[] args) {
        int arr[] = {2,4,3,4,5,2,3};
        System.out.println("Unique number is :"+ uniqueNum(arr));

        FindRange(125);

        NumOfDigits(4523);
        
    }

    static void FindRange(int n){
        double ans1 = Math.pow(-2, n-1); 
        double ans2 = Math.pow(2, n-1) - 1; 
        System.out.println("Range of "+n+ " bit is " +ans1+" to "+ans2);

    }


    static int uniqueNum(int[] arr){
        int unq=0;

        for (int n:arr){
            unq^= n;
        }

        return unq;
    }


    static void NumOfDigits(int n){
        System.out.print("Number of Digits of " + n + " is ");
        System.out.print((int)Math.log10(n) + 1 );
    }
}
