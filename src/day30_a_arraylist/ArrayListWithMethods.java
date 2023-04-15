package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    //make a method that accepts ArrayList and prints the list

    public static String getList (ArrayList<String> list){
        //LIST:
        //   apple
        //   banana
        String finalList ="LIST: ";
        for (String each: list) {
            finalList+="\n\t"+each;

        }
        return finalList;
    }


    //make a method that accepts number and prints the day of the week
    public static void printDayOfWeek (int numDay){
        ArrayList<String> daysOfWeek =new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"));
        if (numDay>=1&&numDay<7) {
            System.out.println((daysOfWeek.get(numDay - 1)));
        } else {
            System.out.println("Number not in the range");
        }


    }


    //use main method to call those methods
    public static void main(String[] args) {
        System.out.println(getList(new ArrayList<>(Arrays.asList("apple","bread","water","butter"))));
        printDayOfWeek(2);
    }
}
