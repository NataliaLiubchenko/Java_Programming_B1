package day12_switch_statements;
/*
Take a number and print number as word
i need to put numbers 1-5, everything else Invalid

 */
public class NumberWords {

    public static void main(String[] args) {
        int num = 1;


        //else if statement
        if (num==1){
            System.out.println("one");
        }else if (num==2){
            System.out.println("Two");
        }else if (num==3){
            System.out.println("Three");
        }else if (num==4){
            System.out.println("Four");
        }else if (num==5){
            System.out.println("Five");
        }else{
            System.out.println("Invalid input");
        }
    }
}
