package javastringmethods;

public class Getbyte {
    public static void main(String[] args) {
        String s1 = "ABCDEF";
        byte[] bytes = s1.getBytes();
        for(int i = 0; i < bytes.length; i++){
            System.out.println(bytes[i]);

            String s2 = new String(bytes);
            System.out.println(s2);
        }
    }
}
