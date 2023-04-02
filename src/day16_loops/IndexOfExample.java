package day16_loops;

public class IndexOfExample {
    public static void main(String[] args) {
        String str = "banana";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        String firstLetter = str.substring(0,1);
        System.out.println(firstLetter);
        System.out.println(str.lastIndexOf("n"));
    }
}
