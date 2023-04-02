package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {

        String days = "monday, tuesday, wednesday, thursday, friday, saturday, sunday";

        String [] dayArr = days.split("ay ");
        System.out.println(Arrays.toString(dayArr));

        String  month = "jan-feb-mar-apr-may-jun-jul-aug-sep-oct-nov-dec";
      //  String [] monthArr = month.split("-");
        for (String  eachMonth: month.split("-")) {
            System.out.println(eachMonth.substring(0,1).toUpperCase()+eachMonth.substring(1).toLowerCase());



        }




    }
}