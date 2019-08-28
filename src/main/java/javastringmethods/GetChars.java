package javastringmethods;

public class GetChars {
    public static void main(String[] args) {
        String str = new String("Hello java");
        char[] ch = new char[8];
        try {
            str.getChars(1, 9, ch, 0);
            System.out.println(ch);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}