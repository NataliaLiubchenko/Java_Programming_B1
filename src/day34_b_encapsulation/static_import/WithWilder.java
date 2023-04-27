package day34_b_encapsulation.static_import;
import static java.util.Arrays.*;
import static my_util.ArrayUtil.*;
public class WithWilder {
    public static void main(String[] args) {
        int [] a ={1, 2, 3, 4, 5};
        sort(a);// since we have done the static import we can call the method by the name only.
       // System.out.println(toString(a)); toString method is not static



        minNumInArrayWithSort(new int[]{4,5,6,7});


    }


}
