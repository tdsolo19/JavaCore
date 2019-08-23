package LearnString;

public class Comparison {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        String s4 = "A1235";
        String s5 = "A1236";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1 == s2);
        System.out.println(s4.compareTo(s5));// compare theo bang chu cai tinh theo thu tu cac ky tu
        System.out.println(s1 == s3);
    }
}
