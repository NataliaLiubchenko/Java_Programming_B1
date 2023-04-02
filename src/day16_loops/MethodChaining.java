package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {
        String word = "   Java is a great language    ";
        word = word.trim().substring(0,word.indexOf(" ")).toLowerCase().toUpperCase();
        System.out.println(word);
    }
}
