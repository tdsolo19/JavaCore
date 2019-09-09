package gemvietnam.com.demo.core.asbtract;

public class Honda extends Bike {
    @Override
    void run() {
        System.out.println("toc do ban tho");
    }

    @Override
    void run1() {
        System.out.println("toc do con rua");
    }

    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.run1();
    }
}
