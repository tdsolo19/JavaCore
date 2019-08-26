package string;

import org.w3c.dom.ls.LSOutput;

public class QuizTest {
    public static void main(String[] args) {


       String name = "sodo";
       String sf1 = String.format("name is %s", name);
       String sf2 = String.format("value is %f", 32.333333);
       String sf3 = String.format("value is %.5f", 40.333337);
       String sf4 = String.format("value is %d %s", 34, "tdsolo");
        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
        System.out.println(sf4);

        String s1 = "ABCDEFGH";
        byte[] barr = s1.getBytes();
        for(int i = 0; i < barr.length; i++){
            System.out.println(barr[i]);
        }




    }
}
