package day15_string;

import java.util.Scanner;

public class ShortestWithA {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 3 words: ");
            String word1 = input.next();
            String word2 = input.next();
            String word3 = input.next();

            int word1Length = word1.length(),
                    word2Length = word2.length(),
                    word3Length = word3.length();
            String msg = " is the shortest with \"a\"";
            String result ="";

            if (word1.contains("a")&&(word1Length<=word2Length&&word1Length<=word3Length)){
                result =(word1+msg);
            }else if (word2.contains("a")&&(word2Length<=word1Length&&word2Length<=word3Length)){
                result= (word2+msg);
            }else if (word3.contains("a")&&(word3Length<=word1Length&&word3Length<=word2Length)) {
                result =(word3 + msg);
            }else {
                System.out.println( "No single largest word with \"a\"");
            }
        System.out.println(result);

        }
}
