package day23_multidimantioanal_arrays;

import day22_arrays.ArrayToString;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {
        int[] n = {2, 4, 5, 6};
        int[] m = {10, 33, 55, 77};

        int[][] all = {n, m};

        System.out.println(Arrays.toString(all)); // printing 2D array
        System.out.println(Arrays.toString(n)); // printing 1D array

        System.out.println(Arrays.deepToString(all)); //Correct way to print 2D array
        System.out.println("First array: "+ Arrays.toString(all[0]));
        System.out.println("Second array: "+ Arrays.toString(all[1]));

        System.out.println("------------------------");

        int [] [] twoD = {
                {2,3,6,8},
                {23, 45, 12, 334},
                {23},
                {345, 898, 987, 897, 12, 67, 8}
        };
        System.out.println(twoD[0].length);
        System.out.println(twoD[1].length);
        System.out.println(twoD[2].length);
        System.out.println(twoD[3].length);

    }
}
