package day09_b_if_statments;

import java.util.Scanner;

public class BankAccaunt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your balance? ");
        double balance = input.nextDouble();

        System.out.println("How much do you want to withdraw? ");
        double withdraw = input.nextDouble();
       // balance = balance-withdraw;
        balance-=withdraw;

        if(balance<0){
            System.out.println("You cannot withdraw because balance cannot be less then zero");
        }else{
            System.out.println("Your new balance is: "+balance);
        }


//        System.out.println();
//        System.out.println("New balance is: "+balance);


    }
}
