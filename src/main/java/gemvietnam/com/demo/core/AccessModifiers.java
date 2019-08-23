package gemvietnam.com.demo.core;

public class AccessModifiers {



     // Atributes
    private int access;
    public int x;
    protected int a;
    int b;


     // Methods
    AccessModifiers tdsolo = new AccessModifiers();
    public AccessModifiers obj = new AccessModifiers();
    private AccessModifiers jav = new AccessModifiers();
    protected AccessModifiers hub = new AccessModifiers();

    // Constructor
    public AccessModifiers(){
        System.out.println("Five Fingers");
    }
    private AccessModifiers(String a){
        System.out.println("Five Fingers");
    }
    protected AccessModifiers (int x, long y){
        x = 1;
        y = 0;
    }

}


// Class

class access {
    // class can use public or default
}