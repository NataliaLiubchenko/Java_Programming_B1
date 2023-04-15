package day30_b_custom_classes;

public class UsingApp {
    public static void main(String[] args) {
        App course = new App();
        //name
        course.name = "loopcamp";
        //version
        course.version = 1.1;
        //isFree
        course.isFree = false;

        System.out.println(course.name);
        System.out.println(course.version);
        System.out.println(course.isFree);
        //run
        course.run();
        //update
        course.update();
        System.out.println("=====================================");
        App social = new App();
        //name
        social.name = "Facebook";
        //version
        social.version =21.3;
        //isFree
        social.isFree= true;

        System.out.println(social.name);
        System.out.println(social.version);
        System.out.println(social.isFree);
        //run
        social.run();
        //update
        social.update();
        System.out.println("===================================");
        System.out.println(course.version);
        System.out.println(social.version);
        System.out.println("===================================");
        new App().run();// We created a new object ot App class and directly called the method call run(). Since that object has not assigned any data to instance variable "name", that is why it is printing the default data/value which is null

    }
}
