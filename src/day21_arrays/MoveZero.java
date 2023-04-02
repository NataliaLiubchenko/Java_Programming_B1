package day21_arrays;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int [] original = {0, 0, 5, 0, 1,0};
        int [] change = new int[original.length];
        int index = 0;

        for (int i = 0; i <original.length ; i++) {
            if (original[i]!=0){
                change[index]=original[i];
                index++;
            }

        }
        System.out.println(Arrays.toString(change));
    }
}
