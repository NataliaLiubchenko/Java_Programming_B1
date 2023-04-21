package day32_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Store {

    public static void main(String[] args) {
        Food food1 = new Food("Apple");
        Food food2 = new Food("Grape", 4 );
        Food food3 = new Food("Banana", 10, 2.99 );
       // Food [] foodArr = {food1, food2, food3};
        ArrayList<Food> foodList = new ArrayList<>();
        foodList.addAll(Arrays.asList( food1,food2,food3));

        for (int i = 0; i < foodList.size(); i++) {

            if ((foodList.get(i).name.charAt(0) + "").equalsIgnoreCase("a")) {
                System.out.println(foodList.get(i));
            }
        }


    }
}
