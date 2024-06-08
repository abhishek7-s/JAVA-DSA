public class palindrom {
    public static void main(String[] args){
        int x = -1521;
        int temp;
        temp =+ x;
        int rev = 0;
        while( x>0 && temp!=0 ){
            int ld = temp%10;
            rev = rev * 10 +ld;
            temp /=10;
        }
        
        System.out.println(rev);
        System.out.println(x);
        System.out.println(rev==x);
    }
}
