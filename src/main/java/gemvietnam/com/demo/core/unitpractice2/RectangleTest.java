package gemvietnam.com.demo.core.unitpractice2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class RectangleTest {

    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static Rectangle[] myArray = new Rectangle[n];

    public static void rec(){
            for (int i = 0; i < n; i++){
                Rectangle obj = new Rectangle();
                Scanner scan = new Scanner(System.in);
                obj.setDaiRong(scan.nextInt(),scan.nextInt());
                obj.area();
                myArray[i] = obj;
                scan.nextLine();
            }
    }

    public static void main(String[] args) {

        System.out.println("Number Rectangle is: " + myArray.length);
            rec();
        for(int a = 0; a < myArray.length; a++){
            System.out.println(myArray[a].getChieuDai());
            System.out.println(myArray[a].getCHieuRong());
            System.out.println(myArray[a].area());
        }
    }

}

