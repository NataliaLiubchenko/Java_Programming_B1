package day15_string;

import javax.swing.*;

public class MoveFirstMethod2 {
    public static void main(String[] args) {
        String str ="One Two";
        String firstPart = str.substring(0, str.indexOf(" "));
        System.out.println(firstPart);
        String secondPart = str.substring(str.indexOf(" ")+1);
        System.out.println(secondPart);
        System.out.println(secondPart+" "+firstPart);

    }
}
