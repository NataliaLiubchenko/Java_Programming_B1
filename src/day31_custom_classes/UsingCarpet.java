package day31_custom_classes;

public class UsingCarpet {
    public static void main(String[] args) {
        Carpet carpetOne = new Carpet(8.5, 12,2.5,false);
        System.out.println(carpetOne);

        carpetOne.calculatePrice();
        System.out.println("--------------------");
        System.out.println(carpetOne);
        System.out.println("--------------------");
        Carpet carpetTwo = new Carpet(8.5,12,2.5, true);
        carpetTwo.calculatePrice();
        System.out.println(carpetTwo);
        System.out.println("--------------------");
        Carpet carpetThree= new Carpet(8.5,12,2.5, true);
        System.out.println(carpetThree);

    }

}
