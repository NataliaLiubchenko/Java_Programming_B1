package day36_inheritance.hiding;

public class B extends A{
    @Override
    public void instanceMethod(){
        System.out.println("");
        staticMethod();
    }
    public static  void  staticMethod(){
        System.out.println("Static method from CHILD class ");
    }

}
