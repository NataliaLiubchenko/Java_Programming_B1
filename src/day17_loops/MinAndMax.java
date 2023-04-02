package day17_loops;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;

      //  int smallest = Integer.MAX_VALUE;
        int smallest = 999999999;
       // int biggest = Integer.MIN_VALUE;
        int biggest = -999999999;

     while (count<=5){
        System.out.println("Enter a number: ");
        int num = input.nextInt();  //10

        if (num>smallest){
            smallest = num;
        }
         if (num<biggest){
             biggest = num;
         }



        count++;

     }





    }
}
