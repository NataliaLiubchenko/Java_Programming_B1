package day33_a_static;

public class BestBuy {
    String location;
    static String headQuarters = "Richfield, MN, USA";
    static  String day = "Sunday";

    static  int numOfComputer = 100;

    public  BestBuy (String location){
        this.location = location;
    }

    //-----------------

    public void openStore(){
        System.out.println("Opening the "+ location);
    }
    public static void reStock(){
        numOfComputer+=100;
        System.out.println(numOfComputer);
    }


}
