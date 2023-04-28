package day35_inheritance.computer;

public class Lab {
    public static void main(String[] args) {
        Windows copm1 = new Windows(512);
        Mac comp2 = new Mac(256);
        System.out.println(copm1.os);
        System.out.println(comp2.os);
        Linux comp3 = new Linux(111);
        System.out.println(comp3.os);
    }
}
