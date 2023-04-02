package day24_methods;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        sayHello();
        sayHelloToWhom("Natalia");
        Scanner input  =new Scanner(System.in);
        System.out.println("Enter a name: ");
        String userName = input.next();
        sayHelloToWhom(userName);
    }

    public static void sayHello(){
        System.out.println("Hello. Hope all is well!");
    }

    public static void  sayHelloToWhom(String name){
        System.out.println("Hello "+name+ ". Hope all is well!");
    }







}
