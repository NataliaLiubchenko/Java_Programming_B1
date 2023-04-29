package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

public class Third {
    public static void main(String[] args) {
       // Third obj = new Third();


        First obj = new First();
        System.out.println(obj.one);// public accessible in all project
        //System.out.println(obj.two);//protected since there is no inheritance its not accessible in different package
       // System.out.println(obj.three);//default available in the same package
       // System.out.println(obj.four); //private is only accessible in the same class



    }
}
