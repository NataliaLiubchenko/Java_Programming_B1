package day38_a_abstraction.interface_methods;

public interface Mac {
    String  NAME = "Mac";// by default public static final

    String OS = "IOS";

    void turnOn();//by default public abstract

    static void company(){
        System.out.println("Apple");
        System.out.println("HQ is in LA");
        System.out.println("New release in November");
    }

    //second option is through default method
    default  void faceTime(){
        System.out.println("Greeting in FaceTime");
        System.out.println("Calling someone");
    }
}
