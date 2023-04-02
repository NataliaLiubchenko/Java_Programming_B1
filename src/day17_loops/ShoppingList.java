package day17_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list ="Shopping List";
        String addMore = "";


        do {
            System.out.println("Enter a name of the item: ");
           // String newItem = input.next();
           // list = list +"\n\t"+input.next();
            list+="\n\t"+input.next();

            System.out.println("Do you want to add more to your shopping list?");
             addMore = input.next();

        }while (addMore.equalsIgnoreCase("yes"));

        System.out.println(list);

    }
}
