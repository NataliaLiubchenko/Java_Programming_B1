package day06_a_arithmetic_operators;

public class DifferentTypes {

    public static void main(String[] args) {

        //two int types
        System.out.println(10-5);
        //two int types
        System.out.println(5*10);
        //double/ int ---> double
        System.out.println(10.0/5);

        System.out.println(10.0/5.0);
        System.out.println((int)(10.0/5.0));

        System.out.println(5*2);
        System.out.println((double)5*2); //because double is bigger ---> double casting first
        System.out.println((double)(5*2)); //multiplication first and then casting to double

        byte b1 = 5;
        short s1 = 6;

        System.out.println(b1*s1);//30 - int
        System.out.println(b1+s1);//11 - int by default




    }
}
