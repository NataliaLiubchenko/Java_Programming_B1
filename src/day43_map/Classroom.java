package day43_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
create a map
add couple student objects into that map as value
for key we add numbers from 1
 */
public class Classroom {
    public static void main(String[] args) {
       Map<Integer, Student> map = new HashMap<>();
       Student s1 =new Student("Javid",3.90,12);
       map.put(1, s1);
       map.put(2,new Student("Vlad",3.90,12));
       map.put(3,new Student("Nazakat",3.90,10));
       map.put(4,new Student("Gunel",3.90,11));
       map.put(5,new Student("Ilgar",4.00,13));
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.get(4).name);
        System.out.println(map.get(4).gpa);
        System.out.println(map.get(4).id);
        System.out.println("*******LOOPING through map***************");
        //LOOPING through map
        System.out.println(map.keySet());

        for (Integer eachKey : map.keySet()) {
            System.out.println("Rank: "+eachKey);
            System.out.println("\tValue: "+map.get(eachKey));
            System.out.println();

        }
        System.out.println("*******LOOPING through map's value***************");
        System.out.println(map.values());
        for (Student eachValue : map.values()) {
            if (eachValue.gpa==4.00) {
                System.out.println(eachValue);
            }

        }
        System.out.println("*******LOOPING through map's ENTERYSET***************");
        for (Map.Entry<Integer, Student> eachEntry : map.entrySet()) {
            if(eachEntry.getKey()>3&&eachEntry.getValue().gpa<3.95) {
                System.out.println("Rank: " + eachEntry.getKey());
                System.out.println("Value: " + eachEntry.getValue());
            }

        }




    }
}
