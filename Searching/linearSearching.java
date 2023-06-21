package Searching;

public class linearSearching {
  
  
    public static int linearSearch (int arr1[] , int target){
        
        if(arr1.length==0){
            return -1;
        }

        
        //for finding element at indexing 
        for(int id = 0 ; arr1.length>=id ; id++){
            int element = arr1[id];
            
            if(element==target){
                return id;
            } 
        }
        return -1;
    }


    public static boolean searchInString(String naam,char target){
        if(naam.length()==0){
            return false;
        }

        for(int i = 0; i<=naam.length();i++){
            if(target==naam.charAt(i)){
                return true;
            }
        }
        return false;
    }


    public static int MinNum(int[] arr){
        int max = arr[0];
        for(int i =1 ; i<arr.length ; i++){
            if(max>arr[i]){
                max=arr[i];
            }
        }
        return max;
    }


    public static void searchIn2Darray(int[][] arr, int target){
        for(int r = 0 ;r<arr.length;r++){
            for(int c = 0; c<arr.length;c++){
                if(arr[r][c]==target){
                    System.out.println("Found on "+ r +"," +c);
                }
            }
        }
    }

    public static void Maxin2Darray(int[][] arr){
        int max = 0;
        for(int i=0;arr.length>i;i++){
            for(int j=0;arr.length>j;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }

    static int MaxWealth(int[][] acc){
        int max =Integer.MIN_VALUE ;
        for(int i = 0;i<acc.length;i++){
            int sum = 0;
            for(int j=0;j<acc[i].length;j++){
                 sum += acc[i][j];
                }
            if(sum>max){
                max = sum;
            }
        }
        return max;

    }
    public static void main(String arg[]){
        
    
        // int arr[]={51,59,5,48,-32};

        int acc[][]={{5,6},{5,4,3},{7,8}};
        // String name = "Abhishek";
        int arr1[][] = {
                          {56,94,78},
                          {54,86,99},
                          {53,95,18}
                        };
        
        //For searching in array
        // int ans= linearSearch(arr,56);
        // System.out.println("index is "+ans);

        //For searching in string
        // boolean ans= searchInString(name, 'a');
        // System.out.println(ans);

        // System.out.println(MinNum(arr));
        // searchIn2Darray(arr1, 18);
        Maxin2Darray(arr1);
        System.out.println(MaxWealth(acc));
    
        


    }
}
