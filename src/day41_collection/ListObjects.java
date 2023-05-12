package day41_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//reference is itself
        List <String> list1 = new ArrayList<>();//reference is interface
        list1.add("a");// index 0
        list1.add("b");// index 1
        list1.add("c");// 2
        list1.add("d");
        list1.add(null);
        list1.add("a");// ArrayList accepts duplicates
        System.out.println(list1);
        System.out.println(list1.get(2));
        List <String> list2 = new LinkedList<>();//reference is interface
        list2.add("a");// index 0
        list2.add("b");// index 1
        list2.add("c");// 2
        list2.add("d");
        list2.add(null);
        list2.add("a");// ArrayList accepts duplicates
        System.out.println(list2);
        System.out.println(list2.get(2));
        List <String> list3 = new Vector<>();//reference is interface
        list3.add("a");// index 0
        list3.add("b");// index 1
        list3.add("c");// 2
        list3.add("d");
        list3.add(null);
        list3.add("a");// ArrayList accepts duplicates
        System.out.println(list3);
        System.out.println(list3.get(2));






    }
}
