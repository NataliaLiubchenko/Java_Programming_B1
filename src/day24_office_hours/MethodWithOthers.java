package day24_office_hours;

public class MethodWithOthers {
   public static String dayOfWeek(int num){
       if (num>7||num<1){

           return "Number is not in the range";
       }
       String [] words = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
       //                   0           1           2            3           4       5           6
       return words[num-1];
   }

   public static String dayOfWeek2 (int num){
       String day = "";
       switch (num){
           case 1:
             return "Mon";
           case 2:
               return "Tuesday";

           case 3:
              return "Wed";

           case 4:
              return  "Thur";

           case 5:
               day = "Fri";
               break;
           case 6:
               day = "Sat";
               break;
           case 7:
               day = "Sun";
               break;
           default:
               day = "Num is nit in the range";

       }

       return day;



   }


    public static void main(String[] args) {
        System.out.println(dayOfWeek(5));
        System.out.println(dayOfWeek(8));
        System.out.println(dayOfWeek2(3));
    }

}
