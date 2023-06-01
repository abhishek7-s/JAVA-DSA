// package Basic;
import java.util.Scanner;

public class oprt {
    public static void main(String[] args) {
        // int a = 5;
        // int b = 5;
        // int c = a+b;
        // System.out.println(c + " Is the sum of a and b");

 
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter value for a  ");
        int a = sc.nextInt();
        
        System.out.print("Enter value for b  ");
        int b = sc.nextInt();
        
        System.out.println("Do you want to Add them? ");
        boolean ans = sc.nextBoolean();

        if(ans==true){
            int c = a+b;
            System.out.println("The sum of a and b is " +c );
        }
        if(ans==false){
            int c = a*b;
            System.out.println("The product of a and b is " +c );
        }
        else{
            System.out.println("Pls Enter valid ans ");
        }
        sc.close();



    }
}