package day3_comments_escape_sequences;

public class TabAndNextLine {
    public static void main(String[] args){
        //this is without tab
        System.out.println("This is not tabbed");

        //this with tab
        System.out.println("\tThis is one tab");
        //this is two tab
        System.out.println("\t\tthis is tabbed twice");

        //exemple in the new line
        System.out.println();
        System.out.println("1) go to the parking lot");
        System.out.println("2) find the car");
        System.out.println("3) star the car");

        System.out.println("\n1) go to the parking lot");
        System.out.println("\n2) find the car");
        System.out.println("\n3) star the car");



        System.out.println("\n1) go to the parking lot\n2) find the car\n3) star the car");

    }
}
