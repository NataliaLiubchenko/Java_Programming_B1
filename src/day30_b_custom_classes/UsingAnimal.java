package day30_b_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {
        Animal bird = new Animal();
        bird.population =1000000000;
        bird.species = "Bird";

        // When we use just the object name to print the information it will by default call the toString() method but we need to have the toString method in the Class
        System.out.println(bird);
        System.out.println(bird.toString());//Normally if you have toString method declared, we do not need to call method this way
        System.out.println(bird); //this by default will call the toString() method but that method needs to be declared in Animal class
        bird.fly();



    }
}
