package day42_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class UsingIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("James");
        list.add("Gosling");
        list.add("Java");
        System.out.println(list);

        Iterator <String> it = list.iterator();
        System.out.println(it.next());//move pin/cursor to the beginning of next and gets that element
        System.out.println(it.next());
        System.out.println(it.next());
      //  System.out.println(it.next()); Exception
        try {
            it.next();
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }
}
