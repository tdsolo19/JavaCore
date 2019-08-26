package string;

public class StringBufferTest {



    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); //Not create a new object when change object old.
        System.out.println(sb);
    }
}
