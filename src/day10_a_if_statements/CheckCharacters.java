package day10_a_if_statements;

public class CheckCharacters {
    public static void main(String[] args) {
        char letter='$';

//        if(letter>=65&&letter<=90){
//            System.out.println("Uppercase");
//
//
//        }
        if(letter>='A'&&letter<='Z'){
            System.out.println("Uppercase");

        }
        if(letter>='a'&&letter<='z'){
            System.out.println("Lowercase");

        }else{
            System.out.println("It is not letter");
        }

    }


}
