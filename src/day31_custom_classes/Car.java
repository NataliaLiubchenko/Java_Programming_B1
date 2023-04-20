package day31_custom_classes;

public class Car {
    String model;
    int year;
    String color;
    int fuelLevel;



    public String toString() {
        return "Car: " +
                "\nmodel = " + model +
                "\nyear= " + year +
                "\ncolor = " + color +
                "\nfuelLevel = " + fuelLevel;
    }

    public void fillTank(){
        System.out.println("filling thank");
        fuelLevel = 100;
    }
    public void fillTank(int level){
        System.out.println("filling thank");
        fuelLevel = fuelLevel+level;
    }
}
