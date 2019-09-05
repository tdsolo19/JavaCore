package gemvietnam.com.demo.core.asbtract;

public class Honda extends Bike {
    @Override
    void run() {
        System.out.println("toc do ban tho");
    }

    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.run1();
    }
}
