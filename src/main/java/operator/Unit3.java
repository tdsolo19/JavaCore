package operator;

//Cho a, b, c là độ dài 3 cạnh tam giác,
// a, b, c được gán giá trị trong chương trình.
// Viết chương trình tính diện tích s của tam giác,
// in kết quả ra màn hình. Tìm số đo 3 góc của tam giác đó,
// in kết quả ra màn hình.

import static java.lang.StrictMath.sqrt;

public class Unit3 {
    public static void main(String[] args) {
        int a = 6, b= 8, c= 9;
        double p =  (double) (a+b+c)/2;
        System.out.println(p);
        double S = sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(Math.ceil(S*10)/10);

        double x = (double) ((a^2 + b^2) - c^2)/ (2*a*b);
        System.out.println(x);

        double degrees = Math.toDegrees(x);
        System.out.println(degrees);






    }
}
