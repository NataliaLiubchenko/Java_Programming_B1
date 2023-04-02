package day12_switch_statements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the vending machine");
        System.out.println("Pleas select one of the followings: \n\tDrinks\n\tSnacks\n\tGum\n\nEnter: ");

        String selection = input.next();

        switch (selection){
            case "Drinks":
                System.out.println("You chose drinks: \n\t1) Water\n\t2) Soda\n\t3) Juice");
                int drinkNumber = input.nextInt();

                if (drinkNumber==1){
                    System.out.println("You have selected water");
                }else if (drinkNumber==2){
                    System.out.println("You have selected Soda");
                }else if (drinkNumber==3){
                    System.out.println("You have selected Juice");
                }else {
                    System.out.println("invalid input");
                }
                break;
            case "Snacks":
                System.out.println("You chose drinks: \n\t1) Candy\n\t2) Chips\n\t3) Nuts");
                int snackNum = input.nextInt();

                if (snackNum==1){
                    System.out.println("You have selected Candy");
                }else if (snackNum==2){
                    System.out.println("You have selected Chips");
                }else if (snackNum==3){
                    System.out.println("You have selected Nuts");
                }else {
                    System.out.println("invalid input");
                }
                break;
            case "Gum":
                System.out.println("You chose drinks: \n\t1) Mint\n\t2) Peppermint \n\t3) Cinnamon");
                int gumNumber = input.nextInt();

                if (gumNumber==1){
                    System.out.println("You have selected Mint ");
                }else if (gumNumber==2){
                    System.out.println("You have selected Peppermint");
                }else if (gumNumber==3){
                    System.out.println("You have selected Cinnamon");
                }else {
                    System.out.println("invalid input");
                }
                break;
            default:
                System.out.println("Not valid selection");
        }
    }
}
