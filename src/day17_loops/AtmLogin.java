package day17_loops;

import java.util.Scanner;

public class AtmLogin {
    public static void main(String[] args) {
        System.out.println("Welcome to ATM");
        int validPin = 1788;
        int userPin;
        int attemptCount=0;
        Scanner input = new Scanner(System.in);
do {
    System.out.println("Enter your pin ");
    userPin = input.nextInt();
    attemptCount++;
}while (attemptCount<3&&userPin!=validPin);
if (validPin == userPin){
    System.out.println("You are logged in");
}else {
    System.out.println("You are logged out. Please contact customer service");
}

    }
}
