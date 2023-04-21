package day32_custom_classes;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numOfPTO;

    public  Offer (String company, String location){
        this.company = company;
        this.location = location;
    }
    public  Offer (String company, String location, double salary){
        this.company = company;
        this.location = location;
        this.salary = salary;
    }
    public  Offer (String company, String location, double salary, boolean isFullTime, int numOfPTO){
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;
    }

    @Override
    public String toString() {
        return "Offer: " +
                "\nlocation: " + location +
                "\ncompany: " + company +
                "\nsalary: $" + salary +
                "\nisFullTime: " + isFullTime +
                "\nnumOfPTO: " + numOfPTO ;
    }
}
