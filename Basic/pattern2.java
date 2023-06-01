//  package Basic;
 
 public class pattern2 {
    
    public static void hellowsq(int trow , int tcolm){
        for(int i = 1 ; i<=trow ; i++){


            // this is for spaces used in inclined pattern
            for(int j = 1 ; j<=trow-i  ; j++){
                System.out.print(" ");
            }
           
            for(int j = 1; j<=tcolm ; j++){
                if(i == 1 || i==trow ||j==1 || j==tcolm ){
                    System.out.print("*");

                }
                else{
                    System.out.print (" ");
                }
            }
        System.out.println(" ");

        }


    }

    public static void inclineSq(int n){
        for (int i = 1 ; i <=n ; i++){
            // For Spaces
            for(int j = 1 ; j<=n-i  ; j++){
                System.out.print(" ");
            }

            // For Star
            for(int j = 1 ; j<=n  ; j++){
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }

    public static void invertedpyramid(int n){
        // n =4 
        for (int i = 1 ; i <=n ; i++){
            // For Spaces
            for(int j = 1 ; j<=n-i  ; j++){
                System.out.print(" ");
            }

            // For Star
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }

    
    public static void invertedHalfNum(int lim){
        // int templm = lim;

        for(int i = 1 ; i <= lim ; i++){
           
            for(int nm = 1 ; nm<=lim-i+1; nm++){
                System.out.print(nm+" ");
            }
            
            System.out.println("");
            // templm--;
        }
        

    }

    public static void floydsTriangle(int n){
        int k = 1;
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j <=i ; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println("");
        }
    }




    public static void butterfly(int n){

        // upper half
        for(int i = 1 ; i<= n ; i++){
        
            // Star
                for(int j = 1 ; j<=i; j++){
                    System.out.print("*");
                }


            // Space
            for(int j = 1 ; j<=2*(n-i); j++){
                System.out.print(" ");
            }


            // star
            for(int j = 1 ; j<=i; j++){
                System.out.print("*");
            }

            System.out.println("");
        
        }
        // Lower Half
        for(int i = n ; i>= 1 ; i--){
        
            // Star
                for(int j = 1 ; j<=i; j++){
                    System.out.print("*");
                }


            // Space
            for(int j = 1 ; j<=2*(n-i); j++){
                System.out.print(" ");
            }


            // star
            for(int j = 1 ; j<=i; j++){
                System.out.print("*");
            }

            System.out.println("");
        
        }
    }
    
    public static void main(String[] args){

        // hellowsq(5, 5);
        // invertedpyramid(4);
        // invertedHalfNum(5);
        // floydsTriangle(5);
        // inclineSq(8);
        butterfly(3);

    }
    
}
