package day11_if_statements;


import java.util.Scanner;

public class NestedExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number>=1&&number<=10){ //Outer IF condition
            if(number%2==0)         //Inner IF condition
                System.out.println("Even");
            else
                System.out.println("Odd");

        }else{
            System.out.println("Number is not in range");
        }

    }
}
