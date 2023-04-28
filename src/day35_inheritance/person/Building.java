package day35_inheritance.person;

public class Building {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "James Bond";
        person.age = 40;
        person.favoriteHobby = "spy";
        person.talk();
       // person.study(); perent class can not  inherit from child class


        Student student = new Student();
        student.name = "Tom Jerry";
        student.age = 40;
        student.favoriteHobby = "cheat";
        student.talk();
        student.funLevel =100;
        student.study();

    }
}
