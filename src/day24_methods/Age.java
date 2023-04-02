package day24_methods;

public class Age {
    /*
    make a method that accepts a number/year
    and calculates how old you are
     */
    public static void calculateAge (int bornYear){
        int currentYear = 2023;
        int yourAge = currentYear - bornYear;
        System.out.println("Method with one argument: You are "+yourAge+" old!");
    }


    public static void calculateAge (int bornYear, int currentYear){
        //int currentYear = 2023;
        int yourAge = currentYear - bornYear;
        System.out.println("Method with two arguments: You are "+yourAge+" old!");
    }


    public static void main(String[] args) {
        calculateAge(1900);
        calculateAge(1960,2023);
    }



}
