package day12_switch_statements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.println("Enter second number: ");
        double number2 = input.nextDouble();
        System.out.println("Enter an operator: \n\t+\n\t-\n\t*\n\t/\n\t% Enter ");
        String operator = input.next();
        boolean isValidOperator = true;

        double result=0;

        switch (operator){
            case "+":
                result = number1+number2;
                break;
            case "-":
                if (number1>number2) {
                    result = number1 - number2;
                }else {
                    result = number2 - number1;
                }
                break;
            case "*":
                result = number1*number2;
                break;
            case "/":
                if (number2!=0) {
                    result = number1 / number2;
                }else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            case "%":if (number2!=0) {
                result = number1%number2;
            }else {
                System.out.println("Cannot divide by 0");
            }

                break;
            default:
                System.out.println(operator+" is not valid for this calculator");
                isValidOperator = false;

        }
        if (isValidOperator) {
            System.out.println(number1 + "" + operator + "" + number2 + " = " + result);
        }






    }
}
