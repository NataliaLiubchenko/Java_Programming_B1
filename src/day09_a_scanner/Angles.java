package day09_a_scanner;

import java.util.Scanner;

public class Angles {

// /*
//    Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
//    Determine if the angles make a triangle, which means the angles add to 180.0
//    and
//    Determine if the angles make a circle, which means the angles add to 360.0
//     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 angle numbers: ");
        double degreeOne = input.nextDouble(),
                degreeTwo = input.nextDouble(),
                degreeThree = input.nextDouble();

        //for triangle total degree of inner calculation is 180
        //calculate the total of all 3 numbers
        double total = degreeOne+degreeTwo+degreeThree;

        //write print statement if its triangle
        System.out.println("Is it triangle: "+ (total==180));

        //write print statement if its circle

        System.out.println("Is it circle: "+(total==360));

        //write a print statement that prints either triangle or circle

        System.out.println("Is it triangle: "+ (total==180 || total==360));

    }

}
