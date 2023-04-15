package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BadPairs {
    public static ArrayList<Integer> pairs (ArrayList<Integer> list){
        ArrayList<Integer> goodPairs = new ArrayList<>();

        for (int i = 0; i <list.size() ; i+=2) {
            if (list.get(i)< list.get(i+1)){
                goodPairs.add(list.get(i));
                goodPairs.add(list.get(i+1));
            }

        }
        return goodPairs;
    }

    public static void main(String[] args) {
        System.out.println(pairs(new ArrayList<>(Arrays.asList(9, 88, 6, 77, 44, 5, 9, 2, 7,10))));

    }
}
