package gemvietnam.com.demo.core.inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PeopleTest extends Manager {
    public static void main(String[] args) {

        Person person1 = new Person("TDsolo","22/12/1992");
        Person person2 = new Person("VTD2008", "17/11/1990");
        System.out.println(person1);
        System.out.println(person2);
        Employee emp1 = new Employee(1600f);
        Employee emp2 = new Employee(1400f);
        System.out.println(emp1);
        System.out.println(emp2);
        Manager mana1 = new Manager(emp1);
        Manager mana2 = new Manager(emp2);
        System.out.println(emp1);
        System.out.println(emp2);

        ArrayList<Person> val = new ArrayList<Person>();
        val.add(person1);
        val.add(person2);
        val.add(emp1);
        val.add(emp2);
        val.add(mana1);
        val.add(mana2);

        System.out.println(val);






    }
}
