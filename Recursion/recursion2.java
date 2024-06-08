package Recursion;

public class recursion2 {
    public static void main(String[] args) {
        // practice(5);
        // System.out.println(factorial(3)); 
        // System.out.println(sum(932259793));

        // System.out.println(1295925973%10);

        // System.out.println(revans(-15423));

        // System.out.println(SumOfDigits(1263));
        
        System.out.println((int)Math.log10(18) + 1);
    }

    static void practice(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        practice(n-1);
        System.out.println(n);
    }

    static int factorial(int n){
        
        
        if(n==0){
            return 1;
        }
        
        return n * factorial(n-1);
    }


    static int sum(int n){
        if(n==0){
            return 1;
        }

        return (n%10) * sum(n/10);
    }

    static int revans(int n){
        int digits = (int)(Math.log10(n))+1;
        return reversed(n , digits);
    }

    static int reversed(int n , int digits){
        if(n%10 == n){
            return n;
        }
        int rem = (n%10);
        return rem * (int)(Math.pow(10,digits-1)) + reversed(n/10, digits-1);

    }


    // static boolean palin(int n ,int s , int e){
    //     if(s>e){
    //         return false ;
    //     }
    //     return false ; // 
        
    // } 

    static int SumOfDigits(int n){
        if (n==0) {
            return 0;
        }
        int ans = (n%10) + (SumOfDigits(n/10));
        return ans%10 + SumOfDigits(ans/10);
    }
    
}
