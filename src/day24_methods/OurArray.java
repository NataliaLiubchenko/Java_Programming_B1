package day24_methods;
/*

      all will accept array argument

      create a method that will print the first element
      create a method that will print the last element
      create a method that will print the element/s
      length matters -> even there is middle, for odd there is one middle

   */
public class OurArray {
    public static void main(String[] args) {
        int [] nums = {12, 3, 67, 98, 3333, 678, 98};

        printEachElemInArr(nums);
        findMiddle(nums);

    }

    public static void firstElemInArr( int [] nums){
        System.out.println("First element: "+nums[0]);
    }
    public static void lastElemInArr( int [] nums){
        System.out.println("Last element: "+nums[nums.length-1]);
    }
    public static void printEachElemInArr( int [] userArr){
        for (int each:userArr) {
            System.out.println(each+" ");

        }

    }
    public static void findMiddle (int [] nums) {
        if (nums.length % 2 == 0) {
            System.out.println("My middles are: " + nums[nums.length/2 - 1] + " and " + nums[nums.length/2]);
        } else {
            System.out.println("My middle is: " + nums[nums.length/2]);
        }
    }




}
