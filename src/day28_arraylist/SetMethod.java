package day28_arraylist;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100); // index 0
        nums.add(300); // 1
        nums.add(700); // 2
        nums.add(500); // 3
        System.out.println(nums);

        nums.set(1, -300);
        System.out.println(nums);

       // nums.set(9, 2000); IndexOutOfBoundsException




    }
}
