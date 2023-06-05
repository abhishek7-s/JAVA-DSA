package Sorting;

public class Sorting {

    public static void bubbleSort(int arr[]){
    //    int Arr[]= {5,1,3,4,2};
    
        for(int turn = 0 ; turn<arr.length-1; turn++){
            for(int i = 0; i<arr.length-1-turn;i++){
                if(arr[i]>arr[i+1]){
                    // swap
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]= temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            int min = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            //Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;      
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int i;
        int j;
        int k = 0;
        int ans[] = new int[nums.length];

        for(i = 0; i<nums.length;i++){
            for(j=0 ; j<nums.length;j++){
                 if(j!=i & nums[i]>nums[j]){
                      k++;
                 }
                }
                
            ans[i]=k;
            k=0;
        }
        return ans;
    }


    public static int ReturnMaxNo(int arr[]){
        int ans=0;
        for(int i = arr.length ; i>0 ; i-- ){
            ans = ans+arr[i];
        }
        
        
        return ans;
    }



    public static void printer(int arr[]) {
        // Print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }


    public static void main(String[]Args){
        System.out.println("hii");

        // int Arr[]= {556,484,457,487};
        // bubbleSort(Arr);
        // selectionSort(Arr);

        // int ans[] = smallerNumbersThanCurrent(Arr);
        // printer(ans);
        // ReturnMaxNo(Arr);

    }
}
