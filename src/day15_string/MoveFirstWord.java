package day15_string;

import java.util.Scanner;

/*
   [Move first word]
       Given a sentence. Display the sentence with the first word moved to the end of the sentence.
       Ex:
       Input: Java is a fun language
       Output: is a fun language Java
       Hint: Use indexOf and substring
    */
public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();
        int firstSpace = sentence.indexOf(" ");
        String beginning = sentence.substring(0,firstSpace);

        System.out.println(beginning);
        String secondPart = sentence.substring(firstSpace+1);
        System.out.println(secondPart);
        System.out.println(secondPart+" "+beginning);

    }
}
