package day18_loops;

import java.util.Scanner;

public class ReversMiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words sentence: ");
        String str = input.nextLine();
        String revers ="";

        int firsSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");
        String middle = str.substring(firsSpace+1,lastSpace);

        for (int i = middle.length()-1; i >=0; i--) {
            revers +=middle.charAt(i);
        }
        System.out.println(str.substring(0,firsSpace)+" "+revers+" "+str.substring(lastSpace));


    }
}
