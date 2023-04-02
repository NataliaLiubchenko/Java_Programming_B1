package day12_switch_statements;

import java.util.Scanner;

/*
ask user what day of week
pint which class we have that day and time of the class
 cover the following
 Monday
 Mon
 monday

 */
public class WeekSchedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String dayOfWeek = input.next();
        String massage ="";
        switch (dayOfWeek){
            case "Monday":
            case "monday":
            case "Mon":
            case "Friday":
            case "friday":
            case "Fri":
               massage = "We do not have a class";
               break;
            case "Wednesday":
            case "Thursday":
            case "WEDNESDAY":
                massage ="We have Java class at 7 pm";
                break;
            case "Saturday":
                massage="We have Java class at 9:30 am";
                break;
            case "Sunday":
                massage ="We have Soft Skill class 9:30 am";
                break;
            default:
                massage="Sunday";


        }
        System.out.println(massage);

    }
}
