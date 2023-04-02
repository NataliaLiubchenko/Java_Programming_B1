package day21_arrays;

public class AverageNumber {
    public static void main(String[] args) {
        int [] arr1 = {10, 15, 5, 6};
        int total = 0;
        for (int each:arr1) {
            total+= each;

        }
        System.out.println("The total: "  + total +
                "\nElement amount: " + arr1.length +
                "\nAverage is: " + (total/arr1.length));
    }
}
