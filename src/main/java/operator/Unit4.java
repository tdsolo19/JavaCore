package operator;
import java.util.Scanner;
// Tim uoc chung lon nhat, boi chung nho nhat cua 2 so tu nhien a va b
public class Unit4 {
    public static int UCLN (int so1, int so2) {

            while (so1 != so2) {
                if (so1 > so2) {
                    so1 = so1 - so2;
                } else {
                    so2 = so2 - so1;
                }
            }
            return so1;
        }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int so1 = number.nextInt();
        System.out.println("Nhap b: ");
        int so2 = number.nextInt();
        System.out.println("UCLN is " + " " + UCLN(so1,so2));

    }

    }









