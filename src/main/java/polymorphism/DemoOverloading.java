package polymorphism;

public class DemoOverloading {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.disp(12);
        obj.disp('a');
        obj.disp(12,"tdsolo");

    }
}
//Static Binding that happens at compile time
// Dynamic Binding that happens at runtime.