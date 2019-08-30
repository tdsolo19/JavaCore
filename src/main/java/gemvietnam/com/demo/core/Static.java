package gemvietnam.com.demo.core;

public class Static {

     static int count=0;

    public static void inc(){
        count ++;
    }

    public static void main(String[] args) {
        Static obj1 = new Static();
        Static obj2 = new Static();
        obj1.inc();
        System.out.println("Obj1: " + obj1.count);
        obj2.inc();
        System.out.println("Obj1: " + obj1.count);
        System.out.println("Obj2: "+ obj2.count);
    }
}
