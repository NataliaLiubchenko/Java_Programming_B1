package day23_multidimantioanal_arrays;

import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = a; //this is not a new array, its just referring to array a

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0]=100;
        b [1]=200;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int [] c = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(c));
        c[0] = -300;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));

        int [] d = Arrays.copyOf(a, a.length+2);
        System.out.println(Arrays.toString(d));
        d [d.length-1]= -900;
        System.out.println(Arrays.toString(d));





    }
}
