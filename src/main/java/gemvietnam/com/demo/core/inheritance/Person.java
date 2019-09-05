package gemvietnam.com.demo.core.inheritance;



public class Person {

    private String name ;

    private String birthday;

    public Person() {
    }

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name +" "+ birthday;
    }

}
