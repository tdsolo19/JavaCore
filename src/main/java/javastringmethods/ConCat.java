package javastringmethods;

public class ConCat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Java";
        String str3 = "Reader";

        String str4 = str1.concat(str2);
        System.out.println(str4);
        String str5 = str1.concat(str2).concat(str3);
        System.out.println(str5);
    }
}
