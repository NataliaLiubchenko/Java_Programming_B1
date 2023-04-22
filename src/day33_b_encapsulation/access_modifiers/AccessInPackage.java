package day33_b_encapsulation.access_modifiers;

public class AccessInPackage {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
       // System.out.println(obj.c); since it is private and in different class its not accessible\

        // System.out.println(obj.z);
        System.out.println(obj.y);

    }
}
