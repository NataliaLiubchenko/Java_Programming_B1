package day32_custom_classes;

public class Employee {
    String name;
    int id;
    String jobTitle;
    double salary;

    public Employee(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
    }
    public Employee(String name,int id, String jobTitle, double salary ){
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void  goToMeeting(){

        System.out.println(name+" is going to a meeting");
    }

    @Override
    public String toString() {
        String msg = "";
        msg += "\nName: "+name;
        msg+="\nJob Title: "+jobTitle;

        msg+="\nID: "+((id!= 0 )?id:"ID to be determent");

        msg+="\nSalary: $"+((salary!= 0.0)?salary:"Salary to be determent");

        return msg;
    }

}
