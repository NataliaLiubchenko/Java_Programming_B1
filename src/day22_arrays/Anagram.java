package day22_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "silent";
        String word2 = "listen";
       // 1. Convert ro arrays
      //  String [] arr1 = word1.split("");
        char [] arr1 = word1.toCharArray();
        char [] arr2 = word2.toCharArray();

        //2 sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //3. compare two
        System.out.println(Arrays.equals(arr1,arr2)?"Anagram":"Not Anagram");



    }

}
