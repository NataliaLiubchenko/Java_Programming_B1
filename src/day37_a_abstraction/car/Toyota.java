package day37_a_abstraction.car;

import day37_a_abstraction.car.Car;

public class Toyota extends Car {
    @Override
    public void start() {
        System.out.println("Insert the key");
        System.out.println("Start the car by turning the key");
    }
}
