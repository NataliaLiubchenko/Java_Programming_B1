package day14_string;

public class RecapMethods {
    public static void main(String[] args) {
        String str = "loop"; // made by LITERALS
        String str2= new String("loop"); // made by new keyword

        System.out.println("compare with == "+(str == str2)); //false
        System.out.println("Compere with .equals()"+str.equals(str2)); //true

        System.out.println("compare with .equals() "+str.equals("LooP")); //false
        System.out.println("Compere with .equalsIgnoreCase()"+str.equalsIgnoreCase("LooP"));//true

        String  word1 = "loop academy";
        System.out.println("to upper case: "+word1.toUpperCase());
        String word2 = "LOOP ACADEMY";
        System.out.println("to lower case: "+word2.toLowerCase());


    }
}
