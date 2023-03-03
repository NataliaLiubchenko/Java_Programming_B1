package day11_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 digit pin code: ");
        int userPin = input.nextInt();
        System.out.println("Enter your last 4 SSN digits: ");
        int userSsn = input.nextInt();

        int correctPin = 1234;
        int correctSsn = 4321;

        if (userPin == correctPin && userSsn == correctSsn) {
            System.out.println("Logged in successfully");
        } else {
            System.out.println("Authentication failed!");}

            if (userPin!= correctPin) {
                System.out.println("You have entered invalid pin code");
            }

            if (userSsn != correctSsn) {
                System.out.println("You have entered invalid SNN 4 digits");
            }








        }
}
