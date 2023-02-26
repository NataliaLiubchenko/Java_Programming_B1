package day09_b_if_statments;

import java.util.Scanner;

public class SingleIfWithScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Why are we studying Java? ");
        String answer = input.nextLine();


        System.out.println("Is Java fun?(true or false) ");
        boolean answer2 = input.nextBoolean();

        if (answer2){
            System.out.println("Feyruz is really happy");
        }

        if (!answer2){
            System.out.println("Feyruz is really not happy");
        }

        System.out.println("Is Java fun?(true or false) ");


        if (answer2){
            System.out.println("Feyruz is really happy");
        }else {
            System.out.println("Feyruz is really not happy");
        }

    }
}
