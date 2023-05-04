package day37_a_abstraction.car;

public class Garage {
    public static void main(String[] args) {
        //Car obj1 = new Car() ;

        Toyota t1 = new Toyota();
        t1.start();
        System.out.println("-------------------");
        Honda h1 = new Honda();
        h1.start();
        System.out.println("-------------------");
        Tesla ts1 = new Tesla();
        ts1.charging();
        ts1.start();
        System.out.println("-------------------");
        Rivian r1 = new Rivian();
        r1.start();
        r1.charging();

    }



}
