package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String [] letter = {"l", "o","o","p"};
        System.out.println(Arrays.toString(letter));
        String word = "loop";

        //toCharArray()
        char[] convertedWord = word.toCharArray();
        System.out.println(Arrays.toString(convertedWord));
        for (int i = 0; i < convertedWord.length ; i++) {
            System.out.println(convertedWord[i]);
        }
        for (char eachLetter:convertedWord) {
            System.out.println(eachLetter);

        }

        String days = "Monday - Sunday";
        char [] allLetters = days.toCharArray();
        System.out.println(allLetters[6]);
        System.out.println(Arrays.toString(allLetters));

    }
}
