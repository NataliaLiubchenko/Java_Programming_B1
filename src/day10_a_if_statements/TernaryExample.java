package day10_a_if_statements;

public class TernaryExample {

    public static void main(String[] args) {

        int a = 4;
        String evenOrOdd;

        if(a % 2==0){
            evenOrOdd = "Even";
        }else{
            evenOrOdd = "Odd";
        }
        System.out.println(evenOrOdd);
         a=9;
        evenOrOdd = (a%2==0)? "Even":"Odd";
        System.out.println(evenOrOdd);



    }
}
