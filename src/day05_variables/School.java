package day05_variables;

public class School {

    public static void main(String[] args) {
        int numberOfStudentsInGrade1 = 40;
        int numberOfStudentsInGrade2 = 30;
        int numberOfStudentsInGrade3 = 35;
        int numberOfStudentsInGrade4 = 50;
        int numberOfStudentsInGrade5 = 44;

        int totalNumberOfStudents = numberOfStudentsInGrade1+numberOfStudentsInGrade2+numberOfStudentsInGrade3+numberOfStudentsInGrade4+numberOfStudentsInGrade5;

        double numberOfDaysInYear =100.5;
        double numberOfSnowDays =5.5;
        double averageGpaInSchool =3.2;

        System.out.println("Number of students in Grade1 = " +numberOfStudentsInGrade1);
        System.out.println("Number of students in Grade1 = " +numberOfStudentsInGrade2);
        System.out.println("Number of students in Grade1 = " +numberOfStudentsInGrade3);
        System.out.println("Number of students in Grade1 = " +numberOfStudentsInGrade4);
        System.out.println("Number of students in Grade1 = " +numberOfStudentsInGrade5);
        System.out.println();
        System.out.println("Total number of Students:"+totalNumberOfStudents);

        System.out.println();

        System.out.println("Number of days in year "+numberOfDaysInYear);
        System.out.println("Number of snow days in year "+numberOfSnowDays);
        System.out.println("Average GPA in school "+averageGpaInSchool);

    }
}
