package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Computer");
        list.add("Laptop");
        list.add("Screen");
        list.add("Keyboard");
        list.add("Mouse");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String removed = list.remove(0); //removes first element
        System.out.println(removed);//returns removed element, we can assign to String because dataType of element is String
        System.out.println(list);

        list.remove("Mouse");
        System.out.println(list);

       boolean isRemoved = list.remove("Keyboard");
        System.out.println(isRemoved);
        System.out.println(list);

        list.add("Screen");
        list.add("Screen");
        list.add("Cable");
        list.add("Screen");
        System.out.println(list);

        list.remove("Screen");
        System.out.println(list);



        // You can remove all the same elements by Iterator which we will cover later.
        // It has a method that check if there is an element before ethe next cycle starts.
        // With traditional loop we will get into an exception because it removes the element and moves everything to left causing an issue reaching element at the end.
        /*
        for ( String each: list) {
            if (each.equals("Screen")){
                list.remove(each);
            }
        }
        System.out.println(list);

         */



    }
}
