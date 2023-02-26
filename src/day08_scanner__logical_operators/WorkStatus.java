package day08_scanner__logical_operators;
import java.util.Scanner;
public class WorkStatus {

    public static void main(String[] args) {
//        create Scanner object
//        ask the user to enter their first name - next
//        ask the user to enter their last name - next
//        ask the user if they are employed - boolean
//        ask the user if they are a student - boolean
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.print("How are you?");
        String feeling = input.next();

        System.out.print("What is the best team? ");
        String team = input.next();

        System.out.print("How much are you making");
        String answerSalary = input.next();


        System.out.println("First name:\t"+firstName+"\nLast name:\t"+lastName);
        System.out.println("How are you? "+feeling);
        System.out.println("what is the best team? "+team);
        System.out.println("How much are you making? "+answerSalary);




    }
}
