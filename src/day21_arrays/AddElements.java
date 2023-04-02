package day21_arrays;

public class AddElements {
    public static void main(String[] args) {
        int [] num = {3, 6, 10};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];

        }
        System.out.println("Total: " +sum);
    }
}
