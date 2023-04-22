package day33_a_static;

public class Iphone {
    String model;
    double price;
//    static String company = "Apple";
//    static String os = "IOS";
//    static boolean aplDay = false;
    static String company;
    static String os;
    static boolean applDay;
    static {
        company ="Apple";
        os = "IOS";
        applDay = false;
    }
    public  Iphone(String model, double price){
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iphone Info" +
                "\n\tmodel:\t" + model +
                "\n\tprice:\t" + price;
    }
}
