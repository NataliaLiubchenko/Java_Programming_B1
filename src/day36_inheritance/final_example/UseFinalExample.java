package day36_inheritance.final_example;

public class UseFinalExample {
    public static void main(String[] args) {
        System.out.println(FinalExample.PLANET);
        //FinalExample.PLANET = "Mars"; we can not change value of constant

        FinalExample obj1 = new FinalExample(20);
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println("----------------");
        FinalExample obj2 = new FinalExample(30);
        System.out.println(obj2.a);
        System.out.println(obj2.b);

    }
}
