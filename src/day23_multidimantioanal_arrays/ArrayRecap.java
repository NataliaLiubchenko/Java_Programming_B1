package day23_multidimantioanal_arrays;

import java.util.Arrays;

public class ArrayRecap {
    public static void main(String[] args) {
        int [] arr = {30, 20, 40, 50, 100};
        int [] arr2 = {180, 350, 27, 50, 70};

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Min in arr: "+arr[0]);
        System.out.println("Max in arr: "+arr[arr.length-1]);
        System.out.println("Min in arr2: "+arr2[0]);
        System.out.println("Max in arr2: "+arr2[arr2.length-1]);

        String [] words = {"java","sql", "api","softskills"};
        Arrays.sort(words);
        System.out.println("After sorting: "+words);




    }
}
