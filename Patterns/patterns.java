package Patterns;

public class patterns {
    
    
    static void pattern1(int n){
        /* 
                *
                **
                ***
                ****
         */
        
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern2(int n){
        /* 
                1
                1 2
                1 2 3
                1 2 3 4
         */
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
    }

    static void pattern3(int n){
        /* 
                *
                **
                ***
                ****
                ***
                **
                *
         */
        
        for (int i = 1; i <= n*2 ; i++) {

            int NoOfcol = i>n ? 2*n-i : i;
            
            for (int j = 1; j <= NoOfcol; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern4(int n){
        /* 
                   *
                  * *
                 * * *
                * * * *
                 * * *
                  * *
                   *
         */
        
        for (int i = 1; i <= n*2 ; i++) {

            int NoOfcol = i>n ? 2*n-i : i;
            int NoOfSpc = n - NoOfcol;

            for (int k = 1; k < NoOfSpc; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= NoOfcol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        /* 
                   1
                 2 1 2
               3 2 1 2 3
             4 3 2 1 2 3 4 
           5 4 3 2 1 2 3 4 5    

    
         */
        
        for (int i = 1; i <= n ; i++) {

            for (int k = 1; k <= n-i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
             for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        /* 
                 1
                212
               32123
              4321234 
         */
        
        // for (int i = 1; i <= n*2 ; i++) {

        //     int NoOfcol = i>n ? 2*n-i : i;
        //     int NoOfSpc = n - NoOfcol;

        //     for (int k = 1; k <= NoOfSpc; k++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = NoOfcol; j >=1; j--) {
        //         System.out.print(j+" ");
        //     }
        //     for (int j = 2; j <= NoOfcol; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

    }


    static void pattern7(int n){
        /*
            4 4 4 4 4 4 4
            4 3 2 1 2 3 4
            4 3 2 1 2 3 4
            4 3 2 1 2 3 4
            4 3 2 1 2 3 4
            4 3 2 1 2 3 4
            4 4 4 4 4 4 4

         */
        for (int j = 1; j <=2*n-1; j++) {
                System.out.print(n+" ");
            }
            System.out.println();

         for (int i = 1; i < 2*n-1 ; i++) {
            
            for (int j = n; j >=1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
         }
         for (int j = 1; j <=2*n-1; j++) {
                System.out.print(n+" ");
            }
            System.out.println();
    }


    static void pattern8(int n){
        n = 2*n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEvryIdx = Math.min(Math.min(i, j), Math.min(n-i,n-j));
                System.out.print(atEvryIdx +" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] Args){

        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(10);
        // pattern6(4);
        // pattern7(4);
        pattern8(2);

    }
}
