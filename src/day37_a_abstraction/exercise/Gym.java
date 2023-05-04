package day37_a_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {
      //  Exercise obj = new Exercise() ;
Running obj =new Running("Running");
        System.out.println(obj.name);
        obj.performExercise();
        System.out.println(obj.getCaloriesBurned(5));

    }
}
