package string;

public class StringBuilderTest {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Hello");
        for (int i=0; i<100000; i++){
            buffer.append("Word");
        }

        System.out.println("StringBuilder is: " + (System.currentTimeMillis() - startTime) + "ms");
    }

}
