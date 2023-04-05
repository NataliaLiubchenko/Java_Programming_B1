package day24_office_hours;

import java.util.Scanner;

public class CountNumbers {
    public static void printNumbers(int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers(5);
        printNumbers(8);
        printNumbers(3);
    }
}
