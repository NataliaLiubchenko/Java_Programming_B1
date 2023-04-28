package day35_inheritance.person;
//Super class, Parent class, Base class
public class Person {
    //instance var (fields) can be inherited
    String name;
    int age;
    String favoriteHobby;
    public void talk(){
        System.out.println(name+ " is talking");
    }

}
