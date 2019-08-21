package gemvietnam.com.demo.core;

public class OrderOfExecution {
    /*
     * Here Creating the Ananymous Block
     */
    {
        System.out.println("Inside Ananymous Block");
    }
    /*
     * Now Creating the Static Block in Class
     */
    static {
        System.out.println("Inside Static Block");
    }
    /*
     * Here Creating the Constructor of Class
     */
    OrderOfExecution() {
        System.out.println("Inside Constructor of Class");
    }


    public static void main(String[] args) {
        // Creating the Object of the Class
        System.out.println("gggggg");
        OrderOfExecution obj = new OrderOfExecution();
        System.out.println("*******************");
        // Again Creating Object of Class
        //OrderOfExecution obj1 = new OrderOfExecution();
    }


}
