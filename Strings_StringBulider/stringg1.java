package Strings_StringBulider;

public class stringg1 {
    public static void main(String[] args) {

        System.out.println("hello");
        String a = "abhishek";
        String b = new String("abhishek"); //new keyword is use to create new object which will not equal to String a
        System.out.println(a==b);
        b = "abhishek";       // here b is pointed to the object to which a is also pointed therefore both will equal i.e a==b
        // System.out.println(a==b);

        System.out.println();
    }
}
