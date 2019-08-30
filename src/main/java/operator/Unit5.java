package operator;

import java.util.Scanner;

public class Unit5 {

    private static int x;


    public static int sum() {
        int y1 = 0;
        while (x != 0) {

            int y = x % 10;
            x /= 10;
            y1 += y;
        }
        return y1;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so int: ");
        x = input.nextInt();
        System.out.println("Sum (x) = " + sum());

    }
}
