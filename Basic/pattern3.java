public class pattern3 {

    static void ptt1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void ptt2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void ptt3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1 +" ");
            }
            System.out.println("");
        }
    }
    static void ptt4(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print(i+1);
            }
            System.out.println("");
        }
    }

    static void revptt1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void revptt2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }


    static void ptt5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i)+1 ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
    static void ptt6(int n){
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i)-1 ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= n-i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    static void ptt9(int n){
        ptt5(n);
        ptt6(n);
    }

    static void ptt7(int n){
        for (int i = 0; i <= 2*n-1; i++) {
            int stars = i;
            if (i>n) {
                stars = (n*2)-i;
            }   
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // ptt1(5);
        // ptt2(5);
        // ptt3(7);
        // ptt4(5);
        // revptt1(5);
        // revptt2(5);

        // ptt5(4);
        // ptt6(4);
        // ptt7(5);
        // ptt9(10);
    }
}
