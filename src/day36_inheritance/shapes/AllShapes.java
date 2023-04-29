package day36_inheritance.shapes;

import java.util.concurrent.Callable;

public class AllShapes {
    public static void main(String[] args) {
        Square obj1 = new Square(3.0);
        System.out.println(obj1);
        System.out.println(obj1.are());
        System.out.println(obj1.perimeter());

        Circle obj2 = new Circle(2);
        System.out.println(obj2);
        System.out.println(obj2.are());
        System.out.println(obj2.perimeter());








    }
}
