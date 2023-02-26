package day05_variables;

public class RecapVariables {
    public static void main(String[] args) {
        byte numberOfCoffeeCup;
        double totalPriceOfCoffee;
        int totalStudentsInClass;

        // we can't print varibales if they don't have value

        // System.out.println(numberOfCoffeeCup);
       // System.out.println(totalPriceOfCoffee);
        // System.out.println( totalStudentsInClass);


        numberOfCoffeeCup =2;
        totalPriceOfCoffee=12.21;
        totalStudentsInClass =543;

        System.out.println(numberOfCoffeeCup);
        System.out.println(totalPriceOfCoffee);
        System.out.println( totalStudentsInClass);

        System.out.println(numberOfCoffeeCup+"*"+totalStudentsInClass);

        double temperature =20.6;
        int javaDays = 5;
        System.out.println();
        System.out.println("This is my temperature:"+temperature);
        System.out.println("it is day "+javaDays+" in Java class");

    }
}
