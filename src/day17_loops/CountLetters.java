package day17_loops;

public class CountLetters {
    public static void main(String[] args) {
        String word = "aabbcca"; //loop is great. loop is amazing
       char letter = 'a';     //"loop"
        int count = 0;
        for (int i = 0; i < word.length(); i++) {


            if (word.charAt(i) == letter) {
                count++;

            }
        }
        System.out.println("Count of letter a is: "+count);






    }
}
