package day36_inheritance.hiding;

public class A {
    public void instanceMethod(){
        System.out.println("");
        staticMethod();
    }
    public static  void  staticMethod(){
        System.out.println("Static method from PARENT class ");
    }
}
