package gemvietnam.com.demo.core;

public class MathClass {
    public static void main(String[] args) {
        double x = 100;
        double y = 55;
        double z = 20;
        double a = 30;

        // return the maximum of two number
        System.out.println("Max number is: " + Math.max(x,y));

        // return square root of x
        System.out.println("Square root of x is: " + Math.sqrt(x));

        // return x^y
        System.out.println("x^y is: "+ Math.pow(x,y));

        //return logarit
        System.out.println("logarit of z is: " + Math.log(z));

        // convert value to radian
        double b = Math.toRadians(a);
        System.out.println(b);

        //return value sin(a)
        System.out.println("Sin(a) is: " + Math.sin(a));

        //return value cos(a)
        System.out.println("Cos(a) is: " + Math.cos(a));


    }

}
