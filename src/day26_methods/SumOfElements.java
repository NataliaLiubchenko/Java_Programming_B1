package day26_methods;

public class SumOfElements {
    //varargs -----> variable arguments
    public static void main(String[] args) {
        int[ ] arr ={12, 34, 23, 12, 65};
        int [] arr2 = new int[]{34, 56, 67, 32};
        System.out.println(sumOfElements(arr));
        System.out.println(sumOfElements(arr2));
        System.out.println(sumOfElements(new int[]{1, 2, 3, 4, 5}));

        System.out.println(sumOfElements2(1, 2, 3, 4, 100));
        System.out.println(method(23, 45, 45, 4));
    }






    //create a method which accepts int array and returns sum of the element

    public static int sumOfElements(int [] arr){
        int sum= 0;
        for (int each:arr) {
            sum+=each;

        }
        return  sum;
    }
    public static int sumOfElements2(int ... arr){
        int sum= 0;
        for (int each:arr) {
            sum+=each;

        }
        return  sum;
    }

    public static int method (int num, int ... arr){
        System.out.println("Testing varargs");
        return 1;
    }
    public static int method (String str, int ... arr){
        return 2;
    }
}
