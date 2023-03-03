package day11_if_statements;

public class Drive {

    public static void main(String[] args) {
        int speed=70;

        if(speed >=90){
            System.out.println("Your speed limit is requiring jail");
        }else if(speed>=70){
            System.out.println("Your speed limit is requiring DL suspension");
        }else if(speed>=60) {
            System.out.println("Your speed limit is requiring court");
        }else if(speed>=50) {
            System.out.println("Your speed limit is requiring a ticket ");
        }else if(speed>=35&&speed<=50) {
            System.out.println("You speed limit is in the speed range");
        }else if (speed<=35&&speed>=0) {
            System.out.println("Going to slow or you are parked");
        }else {
            System.out.println("not valid input");

        }
    }
}
