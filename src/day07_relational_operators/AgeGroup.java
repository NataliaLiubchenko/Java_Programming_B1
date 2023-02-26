package day07_relational_operators;

public class AgeGroup {
    /*
    declare and assign an age variable

    check if the person is a kid
        age --- > up 13 (include 13)

    check if the person is adult
        age --- > 30 or higher
     */
    public static void main(String[] args) {

        int age=40;
        boolean isKid = age<=13;

        System.out.println("You are a kid. Correct? "+isKid);

        boolean isAdult = age>=30;
        System.out.println("Are you an adult? "+isAdult);



    }
}
