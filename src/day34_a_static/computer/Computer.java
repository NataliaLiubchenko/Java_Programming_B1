package day34_a_static.computer;

public class Computer {
    String brand;
    double price;
    String color;
    static boolean hasScreen, hasBattery,hasMemory;


    static {
        System.out.println("Printing static block");
        hasScreen = false;
        hasBattery = true;
        hasMemory = false;
    }

    public Computer(String brand, double price, String color){
        this.brand = brand;
        this.price = price;
        this.color =color;
    }








}
