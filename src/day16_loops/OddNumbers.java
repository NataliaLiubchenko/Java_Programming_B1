package day16_loops;

public class OddNumbers {
    public static void main(String[] args) {
        int num = 2;
        //print numbers from 2 to 100 odd number

        while (num<=100) {
            if (num % 2 != 0) {
                System.out.println(num);
            }

            num++;
        }

    }
}
