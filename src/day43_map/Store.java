package day43_map;

import java.util.HashMap;
import java.util.Map;

public class Store {
    public static void main(String[] args) {
        Map<String,Double> map  = new HashMap<>();
        map.put("Water",1.5);
        map.put("Coffee",2.5);
        map.put("Apples",0.99);
        map.put("Bread",2.35);
        map.put("Cucumber",3.89);
        System.out.println("store Inventory:");
        for (Map.Entry<String, Double> eachItem : map.entrySet()) {
            System.out.println("Item: " + eachItem.getKey() + " for $" + eachItem.getValue());
        }
        System.out.println();
        System.out.println("Values: "+map.values());
    }

}
