package day37_a_abstraction.car;

import day37_a_abstraction.car.ElectricCar;

public class Tesla extends ElectricCar {
    @Override
    public void charging() {
        System.out.println("Tesla is charging by plugging");

    }

    @Override
    public void start() {
        System.out.println("Started by card");

    }
}
