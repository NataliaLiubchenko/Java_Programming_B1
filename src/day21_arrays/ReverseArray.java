package day21_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversed = new int[original.length];

        for (int i = original.length-1; i >=0 ; i--) {

            reversed[reversed.length-(i+1)] = original[i];

        }

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reversed));


    }
}
