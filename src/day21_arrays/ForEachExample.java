package day21_arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int [] nums = {30, 12, 159, 12};

        for (int i = 0; i < nums.length; i++) {
            System.out.println("With traditional for loop: "+nums[i]);

        }
        System.out.println("-----------------------------------------");

        for (int each: nums) {
            System.out.println("Whith foreach loop: "+each);

        }
        System.out.println("-----------------------------------------");

        String [] words = {"java", "soft skills", "selenium", "sql", "api"};

        for (String eachWord: words) {
            System.out.println(eachWord);
            if (eachWord.equalsIgnoreCase("selenium")){
               break;
            }


        }






    }
}
