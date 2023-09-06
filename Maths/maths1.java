package Maths;

public class maths1 {
    public static void main(String[] args) {
        int arr[] = {2,4,3,4,5,2,3};
        System.out.println("Unique number is :"+ uniqueNum(arr));
    }

    static int uniqueNum(int[] arr){
        int unq=0;

        for (int n:arr){
            unq^= n;
        }

        return unq;
    }

}
