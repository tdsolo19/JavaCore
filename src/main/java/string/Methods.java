package string;

public class  Methods{
    private int rollNo;
    private String name;
    private String city;

    public Methods() {
    }

    public Methods(int rollNo, String name, String city){
        this.rollNo = rollNo;
        this.name=name;
        this.city=city;
    }

    public String toString(){//overriding the toString() method
        return rollNo +" "+name+" "+city;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static void main(String args[]){
        Methods s1=new Methods();
        Methods s2=new Methods();

        s1.setRollNo(101);
        s1.setName("Jav");
        s1.setCity("Osaka");
        s2.setRollNo(102);
        s2.setName("Yumi");
        s2.setCity("Kyoto");



        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
        System.out.println(s1.equals(s2));
    }
}
