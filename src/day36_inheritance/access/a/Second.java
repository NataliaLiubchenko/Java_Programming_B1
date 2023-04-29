package day36_inheritance.access.a;
//DIFFERNT class but SAME package
public class Second {
    public static void main(String[] args) {

        //Second obj2 = new Second();

        First obj = new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
        //System.out.println(obj.four); private is only accessible in the same class
        // Since the instance variable four is private it is only accessible in the class level. If we want to access them we can do it indirectly by using Setters and Getters

    }
}
