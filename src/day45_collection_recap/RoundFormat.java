package day45_collection_recap;

import java.text.DecimalFormat;

public class RoundFormat {
    public static void main(String[] args) {
        double d =0.50000;
        DecimalFormat obj = new DecimalFormat("0.000");
        System.out.println(obj.format(d));

        DecimalFormat obj2= new DecimalFormat("0.##");
        System.out.println(obj2.format(d));
    }
}
