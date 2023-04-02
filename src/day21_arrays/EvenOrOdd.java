package day21_arrays;
/*
    Even and odd from array
    Write a program that can count the even and odd number from an array of integers
    Ex:
    Input: [4,1,3,12,5]
    Output:
    Even: 2
    Odd: 3
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        int [] nums = {4,1,3,12,5};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
            System.out.println("Even count: "+even);
            System.out.println("Odd count: "+odd);
        int even1 = 0;
        int odd1 = 0;

        for (int eachElement :nums) {
            if (eachElement % 2 == 0) {
                even1++;
            } else {
                odd1++;
            }


        }
        System.out.println("Even count: "+even1);
        System.out.println("Odd count: "+odd1);




    }
}
