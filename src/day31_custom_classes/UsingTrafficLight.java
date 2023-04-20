package day31_custom_classes;

public class UsingTrafficLight {
    public static void main(String[] args) {


        TrafficLight lightOne = new TrafficLight();
        lightOne.color = "Red"; //Initializing the instance variable
        System.out.println(lightOne.color);

        TrafficLight lightTwo = new TrafficLight("Green");//Initializing directly through constructor
        System.out.println(lightTwo.color);

        TrafficLight lightThree = new TrafficLight("Yellow");
        System.out.println(lightThree.color);



    }
}
