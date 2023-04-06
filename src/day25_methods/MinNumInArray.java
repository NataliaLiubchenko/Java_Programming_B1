package day25_methods;

import java.util.Arrays;

public class MinNumInArray {
    public static int minNumInArray(int [] arr ){
        int min = arr [0];
        for (int each : arr) {
            if (each < min) {
                min = each;

            }

        }
        return min;
    }

    public static int minNumInArrayWithSort(int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int minNumInArrayWithSort2(int ... arr){ //varargs
        Arrays.sort(arr);
        return arr[0];
    }


    public static void main(String[] args) {
        System.out.println(minNumInArrayWithSort2(9, 76,44,32));

    }
}
