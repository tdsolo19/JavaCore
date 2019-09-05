package gemvietnam.com.demo.core.collection;

import java.util.HashMap;

public class HashMapLearn {
    public static void main(String[] args) {
        // tao mot doi tuong HashMap luu tru cacs cap, ma so nhan vien va tien luong.
        // String key: Ma so nhan vien
        // Float value: Tien luong
        HashMap<String, Float> salaryMap = new HashMap<String, Float>();

        salaryMap.put("E01", 1000f);
        salaryMap.put("E02", 12000f);
        salaryMap.put("E03", 1000f);
        salaryMap.put("E04", 5000f);
        salaryMap.put("E05", 700f);
        System.out.println(salaryMap);
        // lay ra tien luong cua nhan vien E02
        Float salary = salaryMap.get("E02");
        // cap nhat tien luong cho nhan vien E05
        System.out.println(salary);

        //cap nhat tien luong cho nhan vien E05
        salaryMap.put("E05",400f);

        System.out.println(salaryMap.get("E05"));

    }
}
