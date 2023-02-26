package day06_b_unary_operators;

public class Store {

    public static void main(String[] args) {

        String store ="Target";
        int numberOfTv = 100;

        System.out.println("I have a total of "+numberOfTv+" TVs");

        System.out.println("Person comes into thye store and they bought one tv");

        System.out.println("Number of TV left in the store: "+ --numberOfTv);
        System.out.println("another person comes into store and puts the TV into his cart");
        System.out.println("Availsble TV in store: " + numberOfTv--);
        System.out.println("person bought that TV");
        System.out.println("now we have TV in total "+numberOfTv);

    }
}
