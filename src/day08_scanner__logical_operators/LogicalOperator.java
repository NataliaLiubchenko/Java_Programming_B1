package day08_scanner__logical_operators;

public class LogicalOperator {

    public static void main (String[] args){


        int num = 20;
        System.out.println(num>5);//true
        System.out.println(num<10);//false

        System.out.println(num>5 && num>10);
        //                  true     true
        System.out.println(num<5 && num>10);

        int i=5;
        int y=10;

        System.out.println(y>9 && i>2);
        System.out.println(y>9 && i>2);

        boolean isCorrect = false;
        System.out.println(isCorrect);
        System.out.println(false);
        isCorrect=!false;




         }
}
