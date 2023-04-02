package day24_methods;

public class VoidVsReturn {
    public static void sayHello(){
        System.out.println("Hello");
    }
    public static String sayBye(){
        return "Bye";
    }


    public static void main(String[] args) {
        sayHello();
        System.out.println(sayBye());


    }
}
