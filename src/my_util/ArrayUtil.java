package my_util;

import java.util.Arrays;

public class ArrayUtil {
    /**
     * This Method accepts an int array
     * And will return minimum number
     */
    public static int minNumInArray(int [] arr ){
        int min = arr [0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    /**
     * This Method accepts an int array
     * And will return minimum number
     */
    public static int minNumInArrayWithSort(int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
