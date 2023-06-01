// package Basic;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
     Scanner ip = new Scanner(System.in);
     /* WHILE LOOP */
        // int i = 0 ;
        // while(i <= 10){
        //     System.out.print(i+",");
        //     i++;
        // }

        //  int i = 0;
        //  System.out.print("Enter the number till which you have to print number from 0 :");
        //  int n = ip.nextInt();
        //  while(i<=n){
        //   System.out.println(i + ",");
        //   i++;
        //  }

        // int i = 0;
        // int sum=0;
        // System.out.print("Enter the number you want to sum till natural number :-");
        // int n = ip.nextInt();
            
        // while(i<=n){
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println("The sum is = "+ sum);
     
     
        /* FOR LOOP  */
        //    for(int i=10;i>=0;i--){
        //     System.out.println(i);
        //    }    
        
        //        int n = 987654321;
        //        int rev = 0;
        //        while(n>0){
        //         int ld = n % 10;
        //         rev = (rev * 10 )+ ld;
        //         n=n/10;
        //        }
        //     System.out.println(rev);
        
        /* DO WHILE LOOP */
        
        // do{
        //     int  n  = ip.nextInt();
        //     if(n % 10 == 0){
        //         System.out.println(n + " is multiple of 10");
        //         continue;
                
        //     }
        //     System.out.println( n );
        // }while(true);
            

        /* Is Prime number or not */
        // int n = ip.nextInt();
        // boolean isprm = true ;
        // for(int i = 2 ; i<=n-1 ; i++){
        //          if(n % i==0){
        //          isprm = false;
        //          } 
        // }
        // if(isprm == true ){
        //     System.out.println(n +" is prime number");
        // }
        // else{
        //     System.out.println(n +" is composite number");
        // }


        /*  Loops Question */
    
            /*Q1 */           
                // for(int i=0; i<5; i++) {
                //     System.out.println("Hello");
                //     i+=2;
                //     }

            /*Q2 */
            
            // System.out.println("enter");
            // int n = ip.nextInt();


            // if(n % 2 == 0){
            //     System.out.println(n);
            // }
            // else{
            //     System.out.println("frvrbh");
            // }

            // int number;
            // int choice;
            // int evenSum = 0;
            // int oddSum = 0;
            
            // do {
            // System.out.print("Enter the number ");
            // number = ip.nextInt();
            
            // if( number % 2 == 0) {
            // evenSum += number;
            // } else {
            // oddSum += number;
            // }
            // System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
            
            // choice = ip.nextInt();
            // } while(choice==1);
            
            // System.out.println("Sum of even numbers: " + evenSum);
            // System.out.println("Sum of odd numbers: " + oddSum);



            /* Q3 */

            System.out.print(" Enter the number to find its Factorial :- ");
            int n = ip.nextInt();
            // int i = 1;
            int ans = 1 ;
            // do{
            //     ans += n * (n-i);
            //     i++;
            //     System.out.println(ans);

            // }while( n-i< n);

            for(int i = 1 ; i<=n ; i++){
                // int ans = 0 ;
                ans *= i;
            }
            System.out.println(ans);






                
            /* Q4 */

            // System.out.print("Enter the number of which you want table :-");
            // int n = ip.nextInt();
            // int mlpr = 1;
            // int ans ;
            // do{
            //     ans = n * mlpr ; 
            //     mlpr++;
            //     System.out.println(" > "+ ans);
            // }while(mlpr<=10);
            
                            
            
            
            
            
            
            ip.close();
            
            
     }
    
}
