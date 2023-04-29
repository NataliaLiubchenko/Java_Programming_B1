package day36_inheritance.hiding;

public class Soccer extends Sports {
  //  @Override
    public static void cheer(){
        System.out.println("Cheering from the CHILD class");
    }
    //It may look like we are overriding but its not because method is static therefore same method in PARENT class becomes hidden when is called by the Child class
}
