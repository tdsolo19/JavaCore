package LearnString;

public class Immutable {
    public static void main(String[] args) {
        String s = "Sachin";
        s = s.concat(" Tendulkar"); // appends the string at the end
        System.out.println(s);
    }
     // Here Sachin is not changed but a new object is created with sachintendulkar.
}
