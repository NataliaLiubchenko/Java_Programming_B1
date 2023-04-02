package day12_switch_statements;
/*
Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

    - The person must be a citizen or a resident
        -> If not print: You must be a citizen or a resident
    - Their age must be between 18 and 35
        -> If not print: Your age must be between 18 to 35 years old
    - They must have a high school diploma
        -> If not print: You must have a high school diploma

    > If all the criteria is met print: You are qualified for the Army
 */

import java.util.Scanner;

public class ArmyQuality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean citizenship;
        boolean isResident;
        boolean hasDiploma;
        int age;
        System.out.println("Are you a citizen? ");
         citizenship = input.nextBoolean();

        System.out.print("\nAre you are resident? ");
        isResident = input.nextBoolean();

        System.out.print("\nDo you have a high school diploma(true/false)?");
        hasDiploma = input.nextBoolean();

        System.out.print("\nHow old are you?");
        age = input.nextInt();

        // you are eligible
        if (citizenship||isResident&&(age>=18&&age<=35)&&hasDiploma){
            System.out.println("You are qualified for the Army");
        } else {
            if (!citizenship&&!isResident){
                System.out.println("You must be citizen or resident");
            }
           if (age<18||age>35){
               System.out.println("Your age must be between 18 to 35 years old");
            }
           if (!hasDiploma){
               System.out.println("You must have a high school diploma");
           }
        }
    }



}
