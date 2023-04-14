package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>(Arrays.asList(4,5,6,72,7,234,76,78));
        System.out.println(original);
        ArrayList<Integer> list1 = new ArrayList<>(original);
        //remove elements that divisible by 2 from list
        list1.removeIf(each -> each%2 == 0);
        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>(original);
        list2.removeIf(each -> each > 100);

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Thur","Fri","Sat","Sun"));
        words.removeIf( each ->  each.startsWith("M") || each.startsWith("F"));
        System.out.println(words);


    }

}
