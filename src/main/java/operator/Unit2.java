package operator;
//Giải phương trình 2ax+b = 8c với a, b, c là số thực –
// được gán giá trị trong chương trình,
// x cũng là số thực, là giá trị cần tìm.
// Sau khi tính x in kết quả ra màn hình,
// ép kiểu x về số nguyên, in kết quả ép kiểu của x ra màn hình!

public class Unit2 {
    public static void main(String[] args) {


        int a = 3, b = 6, c = 2;
        int x;
        x = (8 * c - b) / 2 * a;
        System.out.println(x);
        float x1 = x;
        System.out.println(x1);

    }
}