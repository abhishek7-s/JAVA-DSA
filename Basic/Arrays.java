
public class Arrays {

    public static void updater(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 4;
        }
    }

    public static void printer(int arr[]) {
        // Print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static int LinearSearch(int arr[], int key) {
        int i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;

    }

    public static void ANSLinearSearch(int index) {
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("The key is at index " + index);
        }

    }

    public static int LargerNum(int arr[]) {
        int HighestNum = arr[0];
        int SmallestNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (HighestNum < arr[i]) {
                HighestNum = arr[i];
            }
            if (SmallestNum > arr[i]) {
                SmallestNum = arr[i];
            }

        }
        System.out.println("The Highest number in this array is = " + HighestNum);
        System.out.println("The Smallest number in this array is = " + SmallestNum);
        return HighestNum;
    }

    public static void ReversArr(int arr[], int lg) {
        for (int i = lg - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println("");

    }

    public static int binarySearch(int nums[], int target) {

        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                start = mid - 1;
            }

        }
        return -1;
    }

    public static int[] SumOf2(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            int n1 = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int n2 = nums[j];

                if (i != j & n1 + n2 == target) {
                    return new int[] { i, j };
                }

            }

        }
        return null;

    }

    public static int[] pairing(int nums[]){
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = i+1 ; j<nums.length ; j++){
               
                int ans[] ={nums[i] , nums[j]};
                System.out.print("(");
                for(int k = 0 ; k<ans.length ; k++){
                    System.out.print(ans[k] + " ");
                }
                System.out.print(")");
                }
                System.out.println("  ");
        }
        return null;
    }

    public static int[] subArray(int nums[]){
        for(int i = 0 ; i<nums.length ; i++){
                int start = i;
            for(int j = i ; j<nums.length ; j++){
                int end = j;
                for(int k = start ; k<=end ; k++){
                    System.out.print(nums[k] + " ");
                }
                System.out.println("  ");

                }
            System.out.println("");    
        }
        return null;
    }

    public static int[] MaxSubArray(int nums[]){
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            // int n1 = nums[i];
            for (int j = i; j < nums.length; j++) {
                // int n2 = nums[j];
                ans =0;
                for(int k = i ; k<=j ; k++){
                   ans += nums[k];
                }
                System.out.println(ans);
                if(max < ans){
                    max = ans;
                }
                // System.out.println("  ");
                
                
                
            }
        }
        System.out.println(ans+"is Max sum  ");
        return null;

    }
    public static void main(String[] Args) {

        int marks[] = { 2, 4, 6, 8};
        // int key = 54;
        // updater(marks);
        // printer(marks);
        // int index = LinearSearch(marks, key);
        // ANSLinearSearch(index);
        // LargerNum(marks);
        // ReversArr(marks,marks.length);
        // int ans [] =SumOf2(marks);

        // int ans[] =SumOf2(marks, 6);

        // for(int i = 0 ; i<ans.length ; i++){
        // System.out.print(ans[i] + " ");
        // }

        // System.out.println(binarySearch(marks, 6));
        // pairing(marks);
        // subArray(marks);
        MaxSubArray(marks);
        
    }
}
