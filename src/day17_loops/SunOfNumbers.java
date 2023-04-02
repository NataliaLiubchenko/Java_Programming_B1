package day17_loops;

import java.util.Scanner;

public class SunOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int numOfSum = 0;
        // continue getting a number from user until its negative number
        while (num>=0){
            numOfSum +=num; //numOfSum = numOfNum + num;
            System.out.println("Sum of numbers so far: "+numOfSum);
            System.out.println("Enter number again: ");
            num = input.nextInt();
            if (num<0){
                System.out.println(num+" is negative number. That is why the while loop ended");
            }


        }
    }
}
