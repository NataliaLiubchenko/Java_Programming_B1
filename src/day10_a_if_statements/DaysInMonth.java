package day10_a_if_statements;

public class DaysInMonth {

    public static void main(String[] args) {
        //12 month in the year
        //1 - Jan
        //2 - Feb .....
        int monthNumber = 9;
        boolean has31Days = monthNumber == 1||monthNumber==3||monthNumber==5||monthNumber==7||monthNumber==8||monthNumber==10||monthNumber==12;
        boolean has30Days =  monthNumber == 4||monthNumber==6||monthNumber==9||monthNumber==11;
        boolean has28Days = monthNumber==2;

        if(has31Days){
            System.out.println("This month has 31 days");

        }
        if(has30Days){
            System.out.println("This month has 30 days");

        }
        if(has28Days){
            System.out.println("This month has 28 days");

        }else{
            System.out.println("we have only 12 month");
        }

       //multi branch
        System.out.println();
        if(has31Days){
            System.out.println("This month has 31 days");
        }
        else if(has30Days){
            System.out.println("This month has 30 days");
        }
        else if(has28Days){
            System.out.println("This month has 28 days");
        }else{
            System.out.println("we have only 12 month");
        }

    }
}
