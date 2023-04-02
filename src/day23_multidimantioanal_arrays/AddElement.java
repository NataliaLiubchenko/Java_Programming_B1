package day23_multidimantioanal_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*

        Have a starting array
        you want to add a number to the end
        so make your array bigger to store the new number

        Ex:
            {45, 123, 62}
            adding 100
            {45, 123, 62, 100}

 */
public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What size");
        int arrOneSize = input.nextInt();
        int [] arr1 =new int [arrOneSize];
        System.out.println(Arrays.toString(arr1));


        System.out.println("add your elements one at the time: ");
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("How many more elements you want to add?");
        int addNum = input.nextInt();
        int[] arr2 = Arrays.copyOf(arr1, arr1.length+addNum);
        System.out.println(Arrays.toString(arr2));

        System.out.println("add your elements one at the time for additional spaces: ");
        for (int i = arr1.length; i <arr2.length ; i++) {
            arr2[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr2));







    }
}
