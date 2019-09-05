package gemvietnam.com.demo.core.inheritance;

public class Manager extends Employee {

    private Employee assistant;

    public Manager() {
    }

    public Manager(Employee assistant) {
        this.assistant = assistant;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }
    public String toString(){
        return assistant + "";
    }
}
