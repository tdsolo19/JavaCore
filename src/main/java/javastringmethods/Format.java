package javastringmethods;

public class Format {
    public static void main(String[] args) {
        String name = "TDsolo";
        String s1 = String.format("name is %s", name);
        String s2 = String.format("Value is %f", 1234.5678);
        String s3 = String.format("Value is %.3f", 3333.444567);
        String s4 = String.format("Im is %d", 007);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        String str1 = String.format("%d", 101);          // Integer value
        String str2 = String.format("%s", "Amar Singh"); // String value
        String str3 = String.format("%f", 101.00);       // Float value
        String str4 = String.format("%x", 101);          // Hexadecimal value
        String str5 = String.format("%c", 'c');          // Char value
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}

