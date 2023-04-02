package day15_string;

public class CharMethod {
    public static void main(String[] args) {
        String word = "loop"; // 4 characters
       //              0123
        System.out.println(word.length());

        // a method that returns us a char on a given Index
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        String longWord = "hgdasjdhakggdcdcjnkjnjhukhgjnknlbb,njh"; //38
        System.out.println(longWord.length());

        int lastInsex = longWord.length() - 1;
        System.out.println(longWord.charAt(lastInsex));

        }




    }

