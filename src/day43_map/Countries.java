package day43_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Countries {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> countries =new HashMap<>();
        //add keys US,Turkey,Canada add values:
        countries.put("United States",new ArrayList<>(Arrays.asList("Chicago", "New-York", "Virginia", "DC", "LA")));
        countries.put("Turkey",new ArrayList<>(Arrays.asList("Istambul","Ankara","Izmir","Antalya")));
        countries.put("Canada",new ArrayList<>(Arrays.asList("Quebec","Toronto","Vancuver")));
        System.out.println(countries);
        System.out.println();
        for (ArrayList<String> eachValue : countries.values()) {
            for (String eachCity : eachValue) {
                if (eachCity.startsWith("V")||eachCity.startsWith("I")){
                    System.out.println(eachCity);
                }
            }


        }

    }
}
