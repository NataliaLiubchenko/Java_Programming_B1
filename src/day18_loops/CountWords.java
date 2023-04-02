package day18_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine().trim();

          int count = 0;
        for (int i = 0; i<sentence.length() ; i++) {
          if (sentence.charAt(i)== ' '){
              count++;
          }
        }
        System.out.println("The count of words is: "+(count+1));



    }
}
