package day06_a_arithmetic_operators;

public class House {
    public static void main(String[] args) {
        String houseType="Single House";
        int numberOfBedrooms = 5;
        int numberOfBathrooms = 5;
        int numberOfKitchen = 2;
        boolean isThereABasement=false;
        boolean isThereAnAttic=false;
        boolean isThereAPool=true;
        boolean isItOnSale = false;
        double costOfHouse = 1_000_000.99;
        String address="123 Central Ave";
        int zipCode =12345;
        boolean hasPark=true;
        double schoolRating =4.6;

        String houseInfo= "The "+houseType+" on "+address+", "+zipCode+" $cost "+costOfHouse+"\nThe "+houseType+" has "+numberOfBedrooms+" bedrooms, "+numberOfBathrooms + " bathrooms, " + numberOfKitchen + " kitchens" + "\nIt also includes a basement: " + isThereABasement + ", has an attic: " + isThereAnAttic + ", has a pool: " + isThereAPool + ", is on sale: " + isItOnSale + ", and has a park: " + hasPark + "\nThe schools in the area have a rating of " + schoolRating;

        System.out.println(houseInfo);

    }
}
