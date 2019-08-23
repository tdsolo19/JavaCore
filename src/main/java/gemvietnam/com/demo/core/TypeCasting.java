package gemvietnam.com.demo.core;

public class TypeCasting {
    public static void main(String[] args) {
        //Widening Casting
        int x = 9;
        double y = x;

        //Narrowing Casting
        double a = 6.34;
        int b = (int) a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
