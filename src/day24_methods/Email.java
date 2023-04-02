package day24_methods;

import java.util.Arrays;

public class Email {

    /*
    create a method that takes 2 arguments as name and domain
    and prints out address made out of the name and domain
     */
    public static void generateEmail(String name, String domain){

        String email =name.toLowerCase()+"@"+domain.toLowerCase()+".com";
        System.out.println("Your email address: "+email);
    }

    public static void  secondGenerateEmail (String name, String domain){
        String []nameArr =name.split(" ");
        String email2 = nameArr[0].toLowerCase()+"@"+domain.toLowerCase()+".com";
        System.out.println("Your email address: "+email2);
    }


    public static void main(String[] args) {

    generateEmail("Natalia","GMAIL");
secondGenerateEmail("Natalia Liubchenko","GMAIL");


    }



}
