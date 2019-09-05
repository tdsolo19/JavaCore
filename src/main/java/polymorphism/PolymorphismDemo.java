package polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new AsianCat();

        System.out.println(cat1.getAnimalName());
        System.out.println(cat2.getAnimalName());
    }
}
