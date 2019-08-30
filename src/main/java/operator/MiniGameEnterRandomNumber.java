package operator;
// Enter random number from 1 to 100.

import java.util.Scanner;

public class MiniGameEnterRandomNumber {
    private static int myNumber;
    private static int b = randomNumber();

    private static int randomNumber() {
        int range = (100 - 1) + 1;
        return (int) (Math.random() * range) + 1;
    }

    static int a = 1;

    public static int soLanChon() {

        while (myNumber != b) {

            if (myNumber > b) {
                System.out.println("so cua ban lon hon an so");

            } else {
                System.out.println("so cua ban nho hon an so");
            }
            Scanner Number = new Scanner(System.in);
            myNumber = Number.nextInt();
            a++;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(b);
        Scanner Number = new Scanner(System.in);
        System.out.println("nhap vao so cua ban: ");
        myNumber = Number.nextInt();
        System.out.println(soLanChon());

    }
}