package day24_office_hours;
/*
Write a method that accepts a number between 1 and 10
And returns the number as a word

Ex:
   numWord(4);
   Four

 */
public class NumberWords {

    public static String numWord(int num){
       // switch (num){
//            case 1:
//                System.out.println("One");
//            break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            case 5:
//                System.out.println("Five");
//                break;
//            case 6:
//                System.out.println("Six");
//                break;
//            case 7:
//                System.out.println("Seven");
//                break;
//            case 8:
//                System.out.println("Eight");
//                break;
//            case 9:
//                System.out.println("Nine");
//                break;
//            case 10:
//                System.out.println("Ten");
//                break;
//        }
        if (num>10||num<1){
            System.out.println("Number is not in the range");
            return "Number is not in the range";
        }
        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        //                   0       1       2       3      4       5       6        7        8       9
        return words[num-1];

    }

    public static void main(String[] args) {
        numWord(3);
        String result =numWord(3);
        System.out.println(result);
        System.out.println("-------------------");
        System.out.println(numWord(7));
    }

}
