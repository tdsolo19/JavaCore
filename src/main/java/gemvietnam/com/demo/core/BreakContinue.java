package gemvietnam.com.demo.core;

public class BreakContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 4){
                i++;
                continue; //  tao vong lap moi bat dau tu 5.
            }
            System.out.println(i);
            i++;

        }
    }
}