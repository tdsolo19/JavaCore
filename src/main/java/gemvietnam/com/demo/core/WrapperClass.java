package gemvietnam.com.demo.core;

public class WrapperClass {
    public static void main(String[] args) {
        Integer myInt = 500;
        Double myDouble = 5.99;
        System.out.println(myInt.doubleValue());
        System.out.println(myDouble.intValue());

        String myString = myInt.toString();
        System.out.println(myString.length());

    }
}
