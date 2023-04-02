package day16_loops;

public class MiddleChar {
    public static void main(String[] args) {
        String word = "Californi";
        boolean isEven = word.length()%2==0;
        if (isEven){

            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
        }else{
            System.out.println(word.substring(word.length()/2,word.length()/2+1) );
            System.out.println(word.charAt(word.length()/2)); // same as line 9 but for one character
        }

    }
}
