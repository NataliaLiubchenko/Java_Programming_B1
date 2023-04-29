package day36_inheritance.final_example;

public final class FinalExample {
    final int a = 5;
    //final int b; //if something is final we MUST give the value at initialization
    final int b;
    public final  static  String PLANET = "Earth";// CONSTANT variable
    public FinalExample(int b){
        this.b = b;
    }
}
