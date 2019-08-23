package LearnString;

public class Concatenation {
    public static void main(String[] args) {
        String s = 40 + 20 + "Hello" + "World" + 10 + 9;
        System.out.println(s);
        String s1 = "Welcome";
        String s2 = " to Ha Noi";
        String s3 = s1.concat(s2); // method appends two Strings.
        System.out.println(s3);
    }
}
