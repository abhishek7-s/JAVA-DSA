// package Basic;
import java.util.*;

public class functions{
    public static int sum(int n1 , int n2){
        int sum = n1 + n2;
        return sum;
    }

    public static void swap(int a ,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    public static int mulplyer(int a , int b){
        int c = a * b ;
        System.out.println("The product is "+ c);
        return c;
    }
    
    public static int adder(int a , int b){
        int c = a + b ;
        System.out.println("The sum is "+ c);
        return c;
    }
    
    public static int subtcr(int a , int b){
        int c = a - b ;
        System.out.println("The subtraction is "+ c);
        return c;
    }

    public static int factorial(int n){
        int ans = 1;
        for(int i = 1 ; i<=n; i++){
            ans = ans* i;
        }
        
        // System.out.println(ans);
        return ans;
    }

    public static int avgnum(int a , int b, int c ){
        int ans = (a + b +c )/3;
        return ans;
    }

    public static int BinomialCoefficient(int n , int r){
        int sb = n - r;
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nrfact = factorial(sb);
        int BC = nfact/(rfact * nrfact);

        return BC;

    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        // System.out.println("Enter number for addition ");
        // System.out.println("Enter number 1 :- ");
        // int a = ip.nextInt();
        // System.out.println("Enter number 2 :- ");
        // int b = ip.nextInt(); 
        // System.out.println("The sum is = "+ sum(a, b));


        

        // swap(a , b );
        // System.out.println(a);
        // System.out.println(b);

        // mulplyer(a, b);
        // adder(a, b);
        // subtcr(a, b);
        System.out.println(factorial(4));

        // BinomialCoefficient(a,b);
        // System.out.println(BinomialCoefficient(5, 2));
        // System.out.println(avgnum(9, 45,1 ));
        ip.close();

    }

}
