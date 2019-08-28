package operator;
//Các biến a, b, c là các số nguyên.
// Gán giá trị cho các biến.
// Tìm phần nguyên khi chia các số này cho 2,
// tìm phần dư khi chia các số này cho 3, in kết quả ra màn hình.
// Tăng giá trị a, b, c mỗi biến lên 1, in giá trị 3 số ra màn hình.

public class Unit1 {
    public static void main(String[] args) {


        int a = 13;
        int b = 94;
        int c = 19;
        // lay nguyen khi chia 2
        int a1 = a/2;
        int b1 = b/2;
        int c1 = c/2;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);

        //lay du khi chia 3
        int a2 = a%3;
        int b2 = b%3;
        int c2 = c%3;
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);

        //tang moi so len 1
        int a3 = ++a;
        int b3 = ++b;
        int c3 = ++c;
        System.out.println(a3);
        System.out.println(b3);
        System.out.println(c3);
    }
}