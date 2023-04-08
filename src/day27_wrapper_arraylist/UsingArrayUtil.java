package day27_wrapper_arraylist;

import my_util.ArrayUtil;

import java.util.Arrays;

public class UsingArrayUtil {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrayUtil.addElementBeginning(34, 23, 345, 23, 213, 213)));
        int [] nums = {23, 564, 78, 90, 90};
        int addNum = 45645;

        System.out.println(Arrays.toString( ArrayUtil.addElementBeginning( addNum, nums)));



        String[] allWords = {"hello", "Tom", "Jerry"} ;
        String word ="World";
        System.out.println(Arrays.toString(ArrayUtil.addElementBeginning(word,allWords)));
    }
}
