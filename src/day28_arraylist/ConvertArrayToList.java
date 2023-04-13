package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        ArrayList<Integer> nums;

        Integer [] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        Arrays.asList(arr); //This method from Arrays class, it takes the array and converts it into ArrayList

        nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8,8,34));
        System.out.println(nums);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);
        list2.add(222);
        System.out.println(list2);


    }
}
