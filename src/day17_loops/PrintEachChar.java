package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String str = "java is great";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println("-------------------------------------------");
        for (int i = 0; i < str.length(); i++) {
       // for (int i = 0; i <= str.length()-1; i++) {
            System.out.println(str.charAt(i));

        }
    }
}
