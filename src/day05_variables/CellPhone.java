package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand= "apple";
        String model ="IPhone 10";
        String color ="black";
        double price = 1000.99;
        int storage =128;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have "+model+" from "+brand);
        System.out.println("It came in the color "+color+" and it has "+storage+" GB");
        System.out.println("for sim type "+sim+ " with a camera "+hasCamera+" the total price was "+price);

        String fullMessage= "I have "+model+" from "+brand+"\nIt came in the color "+color+" and it has "+storage+" GB"+"\nfor sim type "+sim+ " with a camera "+hasCamera+" the total price was "+price;

        System.out.println(fullMessage);







    }
}
