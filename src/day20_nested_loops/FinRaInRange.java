package day20_nested_loops;

import java.util.Scanner;

public class FinRaInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        //String word = "";

//        for (int i = 1; i <=num; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                word = "finra";
//               System.out.println(word);
//
//            } else if (i % 3 == 0) {
//                word = "fin";
//                System.out.println(word);
//            } else if (i % 5 == 0) {
//                word = "ra";
//                System.out.println(word);
//
//            }
//
//        }
        for (int i = 1; i <= num; i++) {  //10
            String str = "";

            if (i % 3 == 0) {                //
                str+= "FIN";
            }

            if (i % 5 == 0) {               //RA
                str += "RA";
            }

//
//            if (str.isEmpty()) {
//                System.out.println(i);
//            } else {
//                System.out.println(str + " ");   // 1, 2, 3, 4, 5
//            }


            System.out.println(str.isEmpty() ? i : str  );
            //                 boolean       ? true : false

        }





    }
}
