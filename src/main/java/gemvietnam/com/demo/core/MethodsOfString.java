package gemvietnam.com.demo.core;

public class MethodsOfString {
    public static void main(String[] args) {


        String s = "Sachin";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        String s1 = " professional ";
        System.out.println(s.trim());

        System.out.println(s.startsWith("ch"));
        System.out.println(s.endsWith("in"));
        System.out.println(s.length());

        String a = new String("Hello");
        String b = a.intern();
        System.out.println(a == b);
        int c  = 10;
        String d = String.valueOf(c);
        System.out.println(d+10);



    }
}