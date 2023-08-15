package Arrays2D;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        
        //Syntax 
        ArrayList<Integer> list = new ArrayList<Integer >(5);

        list.add(12);
        list.add(13);

        System.out.println(list);
        // System.out.println(list.get(5));
        // list.set(0, 99);
        // System.out.println(list);
    
        int[] arr = {9,3,2,2,5,9,7,9,3,4};
        printer(arr);
        reverseArray(arr);
        // sortColors(arr);
        printer(arr);
    }   


    static void reverseArray(int[]arr){
        int start = 0;
        int end = arr.length-1;
            for(start = 0;start<end; start++){
                //swap
                int temp =arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                end=end-1;
            }
        
    }

      
    
    static int[] sortColors(int[] nums) {
        for(int i=0 ; i <nums.length-1 ; i++){
            if(nums[i]>nums[i+1]){
                int temp = nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
            return nums;
        }

       
       
        public static void printer(int arr[]) {
            // Print the array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
        }
}
