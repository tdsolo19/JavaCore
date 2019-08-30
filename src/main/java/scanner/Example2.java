package scanner;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        String s = "Hello, This is Java Core";
        Scanner scan = new Scanner(s);
        System.out.println("Boolean Result: " + scan.hasNext());
        System.out.println("String: " + scan.nextLine());
        scan.close();
        Scanner you = new Scanner(System.in);
        //you.useDelimiter("/");

        System.out.println("Enter your age: ");
        int i = you.nextInt();
        System.out.println("Age is: " + i);


        System.out.println("Enter your name: ");
        String n = you.nextLine();
        String name = you.nextLine();
        System.out.println("Name is " + name);

        System.out.println("Enter your salary: ");
        double d = you.nextDouble();
        System.out.println("Salary is: " + d);
        you.close();
    }
}
