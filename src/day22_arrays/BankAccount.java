package day22_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        String [] bankAccOne = {"Tom Jerry", "Checking", "1000234567", "100,000.00"};
        System.out.println("Number of elements in the array: "+bankAccOne.length);
        System.out.println("My entire array: "+ Arrays.toString(bankAccOne));
        System.out.println("Name: "+bankAccOne[0]);
        System.out.println("Account type: "+bankAccOne[1]);
        System.out.println("Account num: "+bankAccOne[2]);
        System.out.println("balance: $"+bankAccOne[3]);

        System.out.println("-------------------------------------");
        String [] bankAccTwo = new String[4];
        System.out.println("Array with default values: "+Arrays.toString(bankAccTwo));
        bankAccTwo[0] = "Micky Mouse";
        bankAccTwo[1] = "Saving";
        bankAccTwo[2] = "1234567890";
        bankAccTwo[3] = "1,987,999.87";
        // bankAccTwo[4] = "1,987,999.87"; RunTimeExeption
        System.out.println("My entire array: "+ Arrays.toString(bankAccTwo));

        System.out.println("-------------------------------------");
        Scanner input = new Scanner(System.in);
        String [] bankAccThree = new String[4];
        System.out.println("Name: ");
        bankAccThree[0] = input.nextLine();
        System.out.println("Account type: ");
        bankAccThree[1] = input.nextLine();
        System.out.println("Account num: ");
        bankAccThree[2] = input.nextLine();
        System.out.println("Balance: $");
        bankAccThree[3] = input.nextLine();
        System.out.println("My entire array: "+ Arrays.toString(bankAccThree));

        System.out.println("-------------------------------------");

        String [] questions = {"Name: ","Account type: ","Account num: ","Balance: $"};
        String [] bankAccFour = new String[4];
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            bankAccFour [i]= input.nextLine();
        }
        System.out.println("My entire array: "+ Arrays.toString(bankAccFour));






    }
}
