package day10_a_if_statements;

public class DaysOfWeek {
    public static void main(String[] args) {
        int dayNumber=4;
        if(dayNumber==1){
            System.out.println("Monday");
        }else if(dayNumber==2){
            System.out.println("Tuesday");
        }else if(dayNumber==3){
            System.out.println("Wednesday");
        }else if(dayNumber==4){
            System.out.println("Thursday");
        }else if(dayNumber==5)              //single statement can be WITHOUT {}
            System.out.println("Friday");
        else if(dayNumber==6){
            System.out.println("Saturday" );
        }else if(dayNumber==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Invalid number of day");
        }

    }
}
