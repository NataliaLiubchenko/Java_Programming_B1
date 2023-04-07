package day26_methods;

import my_util.ArrayUtil;

import java.util.Arrays;

public class UsingArraysUtil {
    public static void main(String[] args) {
        boolean result = ArrayUtil.containArr(new int[]{1, 4, 7}, 666);
        System.out.println(result);
    }
}
