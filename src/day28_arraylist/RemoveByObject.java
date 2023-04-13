package day28_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.remove(0);  //this will remove the index -- indexes always a primitive data type
        System.out.println(nums);
        nums.remove((Integer)500);
        System.out.println(nums);
        Integer elem = 800;
        nums.remove(elem);
        System.out.println(nums);

        nums.add(900);
        System.out.println(nums);

        nums.remove(Integer.valueOf(900)); //This is not preferable way to do

        System.out.println(nums);
    }
}
