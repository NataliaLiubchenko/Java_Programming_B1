package day37_a_abstraction.exercise;

public class Running extends Exercise{
    public Running(String name){
        super(name);
    }

    @Override
    public void performExercise() {
        System.out.println("Running for fun");

    }

    @Override
    public int getCaloriesBurned(int minuets) {
        return minuets*5;
    }
}
