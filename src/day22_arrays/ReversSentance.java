package day22_arrays;

public class ReversSentance {
    public static void main(String[] args) {
        String sentence = "Today is Wednesday and we learned some useful methods";
        String [] words = sentence.split(" ");
        String reversed = "";
        for (int i = words.length-1; i >=0; i--) {
            reversed+=words[i]+" ";

        }
        System.out.println(reversed.trim());


    }
}
