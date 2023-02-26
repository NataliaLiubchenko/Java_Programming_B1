package day08_scanner__logical_operators;

public class Discount {
    public static void main(String[] args) {
//        declare and assign
//        is it the weekend
//        are you a teacher
//        are you a police officer
//        are you a firefighter
//
//        Do you get a discount?
//                Must be a weekend day and you must be one of the given professions
        boolean isItTheWeekend = true,
                areYouATeacher= false,
                areYouAPoliceOfficer = false,
                areYouAFirefighter = true,
                GetDiscount=isItTheWeekend&& (areYouATeacher||areYouAFirefighter||areYouAPoliceOfficer);
        System.out.println(GetDiscount);



    }


}
