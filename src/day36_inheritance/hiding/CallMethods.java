package day36_inheritance.hiding;

public class CallMethods {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.instanceMethod();
        obj1.staticMethod();
        B obj2 = new B();
        obj2.instanceMethod();
        obj2.staticMethod();

    }

}
