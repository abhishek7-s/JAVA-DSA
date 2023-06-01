// package Basic;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        
        /*  Q1 :- Write a Java program to get a number from the user and print whether it 
                  positive or negative.     */

                //  int a = ip.nextInt();
                 
                //  if(a<0){
                //      System.out.println("The given number is Negative i.e " + a );
                //  }
                //  else{
                //      System.out.println("The given number is Postive i.e "+ a);
                //  }
                 


        /*  Q2 :- Finish the following code so that it prints You have a fever if your temperature
                  is above 100 and otherwise prints You don't have a fever. */ 
                  
                //   System.out.println("Enter your body Temperature");
                // double temp = ip.nextDouble();
                // if(temp > 100) {
                //     System.out.println("You have fever Because your temp is Above 100c ");
                // }
                // else{
                //     System.out.println("You are safe Because your temp is bleow 100c ");
                // }
                        
        /*  Q3 :- Write a Java program to input week number(1-7) and print day of week name
                  using switch case. */         
                  
                //  System.out.println("Enter the Week number to find week day "); 
                // int wn = ip.nextInt();
                // String day;

                // switch(wn){
                //     case 1:{
                //       day = "Monday";      
                //     }
                //     break;
                //     case 2:{
                //         day = "Tuesday";      
                //     }
                //     break;
                //     case 3:{
                //         day = "Wednesday";      
                //     }
                //     break;
                //     case 4:{
                //         day = "Thurday";      
                //     }
                //     break;
                //     case 5:{
                //         day = "Friday";      
                //     }
                //     break;
                //     case 6:{
                //         day = "Saturday";      
                //     }
                //     break;
                //     case 7:{
                //         day = "Sunday";      
                //     }
                //     break;
                //     default:{
                //         day = "Invalid day";
                //     }
                //     break;
                // }    

                // System.out.println("The Week of the Day according to weeknumber is "+ day);

        /*  Q4 :- Write a Java program that takes a year from the user and print whether that
                  year is a leap year or not.     */

            System.out.print("Enter the year that you want to check whether it is a leap year or not =");
            int year = ip.nextInt();

            if(year%4==0)
            {
                if(year%100==0){
                   
                    if(year%400==0){
                        System.out.println("Its a Leap Year");
                    }
                    else{
                        System.out.println("Its not a Leap Year");
                    }
                }
                 else{
                 System.out.println("Its a Leap Year");

                }
             }
            else{
                System.out.println("Its not a Leap Year");
                }







        ip.close();
    }
}
