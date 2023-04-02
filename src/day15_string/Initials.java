package day15_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first = input.next();
        System.out.println("Enter Last name: ");
        String last = input.next();

        String initials =""+ first.charAt(0)+last.charAt(0);
       // String initials =(""+ first.charAt(0)+last.charAt(0)).toUpperCase(); another option
        initials= initials.toUpperCase();
        System.out.println("Your initials is: "+initials);
        //System.out.println("Your initials is: "+initials.toUpperCase()); another option

    }
}
