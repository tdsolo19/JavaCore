package gemvietnam.com.demo.core;

public class Equals {
    public static void main(String[] args) {
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Another String";
        String myStr4 = new String("Hello1");
        String myStr5 = myStr4;
        String myStr6 = new String("Hello1");


        System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
        System.out.println(myStr4 == myStr6);
        System.out.println(myStr1.equals(myStr3)); // false
    }
}
