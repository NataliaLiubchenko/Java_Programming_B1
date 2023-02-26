package day09_b_if_statments;

public class SingleIf {
    public static void main(String[] args) {
        //if condition is true print out "Today is java day"

        if(true){
            System.out.println("Today is java day");

        }

        //System.out.println("Today is java day");

        //max number of days in Feb 28
        int maxNumberOfDays = 28;
        if(maxNumberOfDays == 28){
            System.out.println("This month is February");}

            maxNumberOfDays = 30;
            if(maxNumberOfDays == 28){
                System.out.println("This month is February");
        }
            int quizResult = 50;
            int passRate =65;
            if(quizResult>=passRate){
                System.out.println("Passed the exam.");
            }
            if (quizResult<passRate){
                System.out.println("Failing to exam.");
            }

            int year = 2021;
            boolean covidYears =year>=2020&&year<=2022;

            if (!covidYears){
                System.out.println("it was Covid year");
            }

    }
}
