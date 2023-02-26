package day07_relational_operators;

public class SignType {

    public static void main(String[] args) {
        int number=-1;
        number--;
        boolean isPositive = number>=0;
        boolean isNegative = number<=0;
        boolean isZero = number==0;
        System.out.println(number+" is bigger then zero: "+isPositive);
        System.out.println(number+" is lee then zero: "+isNegative);
        System.out.println(number+" is equal zero: "+isZero);
    }
}
