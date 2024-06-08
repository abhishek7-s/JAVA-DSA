import java.util.ArrayList;


public class subArrayWithFixedBound {



    public static void printer(int arr[][],int m , int n) {
        // Print the array
        for(int row = 0 ; row<m ; row++){
            for(int colm = 0 ; colm<n ; colm++)
          System.out.print(arr[row][colm]+",");
          System.out.println();
        }
    }



    public static void main(String[] args) {
        int[] nums = {1,3,5,2,7,5};
        int mink = 1;
        int maxk = 5;

        ArrayList<Integer> list = new ArrayList<Integer >(5);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= mink) {
                if (nums[i]<= maxk) {
                    list.add(nums[i]);
                }
                else{
                    break;
                }
            }
            else{
                // break;
            }
        }

        System.out.println(list);
        
    }   
}
