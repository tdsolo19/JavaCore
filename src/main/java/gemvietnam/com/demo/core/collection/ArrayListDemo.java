package gemvietnam.com.demo.core.collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList val = new ArrayList();// khai bao kieu cu: non-generic
        ArrayList<String> val1 = new ArrayList<String>(); // khai bao kieu moi: generic

        System.out.println(val.size());
        val.add("C");
        val.add("A");
        val.add("E");
        val.add("B");
        val.add("D");
        val.add("F");
        val.add(1,"A2");
        System.out.println(val.size());

        System.out.println(val);

        val.remove("F");
        val.remove(2);
        System.out.println(val.size());
        System.out.println(val);

//        Lớp ArrayList trong java có thể chứa các phần tử trùng lặp.
//        Lớp ArrayList duy trì thứ tự của phần tử được thêm vào.
//        Lớp ArrayList là không đồng bộ (non-synchronized).
//        Lớp ArrayList cho phép truy cập ngẫu nhiên vì nó lưu dữ liệu theo chỉ mục.
//        Lớp ArrayList trong java, thao tác chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.


    }
}
