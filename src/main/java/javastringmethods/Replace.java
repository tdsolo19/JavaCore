package javastringmethods;

public class Replace {
    public static void main(String[] args) {
        String s1="javatpoint is a very good website";
        String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'
        System.out.println(replaceString);
        String s3=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"
        System.out.println(s3);
        String s2="my name is khan my name is java";
        String replaceString2=s1.replace("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString2);

    }
}
