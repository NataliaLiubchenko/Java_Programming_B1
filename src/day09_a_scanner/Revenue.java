package day09_a_scanner;

import java.util.Scanner;

public class Revenue {
    //create a main method
    //		create a Scanner object
    //
    //		Ask the user to "enter product price and quantity:" (use the input twice)
    //		Then calculate the revenue.
    //    			revenue = price Ã quantity.Â
    //
    //		Output:
    //			Revenue: $revenue

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // java creates an object here

        double price; // java declares price variable
        int quantity;

        System.out.println("Enter the price and quantity: ");// java says whatever is in ""
        price = input.nextDouble(); //java asks user to put info then assigns the value
        quantity = input.nextInt();


        double revenue = price*quantity;
        System.out.println("your revenue: "+revenue);

        //System.out.println(price);
       // System.out.println(quantity);


    }
}
