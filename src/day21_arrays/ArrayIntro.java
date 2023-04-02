package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        //with normal way
        String city1 = "Fairfax";
        String city2 = "New York";
        String city3 = "Alexandria";
        String city4 = "Bethesda";
        String city5 = "Reston";
        String city6 = "Gaithersburg";

        //declaring the array
        String [] cities = {"Fairfax","New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"}; //6 elements

        //String  cities [] = {"Fairfax","New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"}; //another way to declare


       // How can I reach each element?
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);  //String [] cities = {"Fairfax","New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"};
       // System.out.println(cities[6]);                          0          1           2             3          4            5


        //How to print all elements?

        System.out.println("All cities: "+cities[0]+cities[1]+cities[2]+cities[3]+cities[4]+cities[5]);

       // Arrays.toString(parameter);
        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.toString(cities).substring(1));

        //How do we get number of elements in array
        System.out.println(cities.length);

        String allCities = Arrays.toString(cities); // turning to a String
        System.out.println(allCities.length());    // 63 characters in a String





    }
}
