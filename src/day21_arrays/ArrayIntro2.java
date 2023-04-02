package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr = new double[5]; // 0, 1, 2, 3, 4

      //  arr = new double[6]; //resigning to new object

       // arr[5] = 30; out of bound

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr)); // [0.0, 0.0, 0.0, 0.0, 0.0]

        int [] arr2 = new int[3];
        System.out.println(Arrays.toString(arr2)); //[0, 0, 0]

        boolean [] arr3 = new boolean[2];
        System.out.println(Arrays.toString(arr3)); //[false, false]

        String [] arr4 = new String[4];
        System.out.println(Arrays.toString(arr4));  //[null, null, null, null]

        arr [0] = 10;
        arr [1] = 23.3;
        System.out.println(Arrays.toString(arr)); //[10.0, 23.3, 0.0, 0.0, 0.0]
        arr [2] = -44.4;
        arr [3] = 100;
        arr [4] = 500;


        String [] cities = {"Fairfax","New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"};
        System.out.println();




    }
}
