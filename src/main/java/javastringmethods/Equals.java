package javastringmethods;

public class Equals {
    public static void main(String[] args) {
        String s1 = "Java core";
        String s2 = "Python";
        String s3 = "Java core";
        String s4 = "PYTHON";

        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s4));
        System.out.println(s2.equalsIgnoreCase(s4));
    }
}
