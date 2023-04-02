package day13_string;

public class StringMethods {
    public static void main(String[] args) {
        String name = "James";

        // how to compare 2 Strings exactly ----> we use .equals(); method
        System.out.println(name.equals("James")); //we used reference/ variableName  //true

        System.out.println("cat".equals("dog")); //we used directly value/object    //false

        System.out.println(name.equals("james")); //false


        // how to compare 2 Strings ignoring case sensitiveness ----> we use .equalsIgnoreCase() method
        System.out.println(name.equalsIgnoreCase("JAMES"));







    }
}
