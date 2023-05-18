package day43_map;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//Order not guaranteed | null as KEY is OK
        map.put("James", "Java");
        map.put("Tom", "Cartoon");
        map.put("Bond", "Movie");
        map.put("Nadir", "Automation");
        map.put(null, "test");
        map.put("check", null);
        System.out.println(map);
        System.out.println();
        Map<String, String> linked = new LinkedHashMap<>();
        linked.put("James", "Java");
        linked.put("Tom", "Cartoon");
        linked.put("Bond", "Movie");
        linked.put("Nadir", "Automation");
        linked.put(null, "test");
        linked.put("check", null);

        System.out.println(linked);
        System.out.println();
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("James", "Java");
        treeMap.put("Tom", "Cartoon");
        treeMap.put("Bond", "Movie");
        treeMap.put("Nadir", "Automation");
        treeMap.put("check", null);
        //  treeMap.put(null,"test");
        System.out.println(treeMap);

        System.out.println();
        Map<String, String> tableMap = new Hashtable<>();
        tableMap.put("James", "Java");
        tableMap.put("Tom", "Cartoon");
        tableMap.put("Bond", "Movie");
        tableMap.put("Nadir", "Automation");
       // tableMap.put("check",null);
         // tableMap.put(null,"test");
        System.out.println(tableMap);
        System.out.println("METHODS");
        System.out.println(map.get("James"));
        System.out.println(map.get("TEST"));
        System.out.println(map.containsKey("James"));
        System.out.println(map.containsKey("TEST"));
        System.out.println(map.containsValue("James"));
        System.out.println(map.containsValue("TEST"));
        System.out.println(map.remove("James"));
        System.out.println(map);
        System.out.println(map.remove("TEST"));
        System.out.println(map);

    }
}