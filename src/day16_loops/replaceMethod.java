package day16_loops;

public class replaceMethod {
    public static void main(String[] args) {
        String str = "java language";
        System.out.println(str);

        str = str.replace('a','u');
        System.out.println(str);
        str = str.replace('u','o');
        System.out.println(str);

        String str2 ="Today is Thursday.Thursday is good";
        str2 = str2.replace("Thursday","Saturday");
        System.out.println(str2);

        str2 = str2.replaceFirst("Saturday","Monday");
        System.out.println(str2);

    }
}
