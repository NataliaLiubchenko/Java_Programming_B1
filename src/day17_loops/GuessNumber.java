package day17_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int secretNumber = 77;
        int guessNumber;
        Scanner input  = new Scanner(System.in);
      do  {
          System.out.println("Guess a number from 1 - 100 to find what is in my mind");
          guessNumber = input.nextInt();
        if (guessNumber<secretNumber){
            System.out.println("its too low");
        }else if (guessNumber >secretNumber){
            System.out.println("its too high");
        }
      }while (secretNumber!=guessNumber);
          System.out.println("you guessed correct number");


      }

}

