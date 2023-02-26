package day09_a_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Today is Saturday ");
        System.out.print ("What is todays class? ");
        String className = input.next();
        System.out.println();

        System.out.println("What month is it?");
        String month = input.next();
        //System.out.println(input.next());
        System.out.println("I like "+month+" month");
        System.out.println();

        input.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.println("Full Name: "+fullName);

        input.close();



    }
}
