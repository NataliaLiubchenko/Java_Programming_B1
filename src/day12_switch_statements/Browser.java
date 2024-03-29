package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your browser: ");
        String browser = input.next();

        System.out.println("Enter a URL: ");
        String url = input.next();

        switch (browser){
            case "chrome":
            case "Chrome":
            case "CHROME":
                System.out.println("Going into the "+url+" in chrome browser");
                break;
            case "edge":
                System.out.println("Going into the "+url+" in "+ browser+" browser");
                break;
            case "safary":
                System.out.println("Going into the "+url+" in "+ browser+" browser");
                break;
            case "firefox":
                System.out.println("Going into the "+url+" in "+ browser+" browser");
                break;
            default:
                System.out.println(browser+" is invalid browser type");
        }
    }
}
