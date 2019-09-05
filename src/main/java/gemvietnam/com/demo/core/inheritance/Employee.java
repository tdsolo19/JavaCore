package gemvietnam.com.demo.core.inheritance;

public class Employee extends Person {

    private double salary;

    public Employee() {
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String birthday) {
        super(name, birthday);
    }

    public double getSalary() {
        return salary;
    }
    public String toString(){
        return salary + "";
    }

}
