package day26_methods;

public class Picture {

    public static void main(String[] args) {

    }
    public static  void draw (){ //non-parameterized method
        System.out.println("Trying to draw");
    }

    public  static  void draw (String color){ //a parameterized method - overloaded method
        System.out.println("Drawing with the "+color);

    }

    public static void draw (String color, String color2){
        System.out.println("Drawing with two different colors: "+color+" and "+color2);

    }
    public static  void draw (int size){
        System.out.println("Drawing in this size "+size);
    }

    // WE CANNOT OVERLOAD WITH DIFFERENT PARAMETER NAME. IT HAS TO BE DIFFERENT DATA TYPE OR DIFFERENT AMOUNT OF PARAMETERS

//    public static  void draw (int length){
//        System.out.println("Drawing in this size "+length);
//    }
public static void  draw (String str, int size){
    System.out.println("Just drawing");
}
    public  static void  draw (int size,String str) {
        System.out.println("Just drawing");
    }
}
