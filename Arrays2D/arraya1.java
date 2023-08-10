package Arrays2D;
import java.util.Scanner;
public class arraya1 {


    public static void printer(int arr[][],int m , int n) {
        // Print the array
        for(int row = 0 ; row<m ; row++){
            for(int colm = 0 ; colm<n ; colm++)
          System.out.print(arr[row][colm]+",");
          System.out.println();
        }
    }

    public static boolean finder(int arr[][],int key ){
        for(int i = 0;i<arr.length ;i++){
            for(int j = 0 ;j<arr[0].length ;j++){
                if(arr[i][j]==key){
                    System.out.print("Found it on ("+ i +","+ j +")");
                    // System.out.print(i+","+j);
                    return true;
                }
            } 
        }
        System.out.println("Not found");
        return false;
    }


    public static void main(String[] Args){
        Scanner ip = new Scanner (System.in);
        // int key = 10;
        int m=3;
        int n=3;
        int matrix[][] = new int[3][3];
        for(int row = 0 ; row<m ; row++){
            for(int colm = 0 ; colm<n ; colm++)
            matrix[row][colm]=ip.nextInt();
        }
    
        printer(matrix, m, n);

        System.out.println(matrix.toString());
        // finder(matrix, key);
        ip.close();
    }  
}
