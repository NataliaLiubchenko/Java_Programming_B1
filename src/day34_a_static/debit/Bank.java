package day34_a_static.debit;

public class Bank {
    public static void main(String[] args) {

        DebitCard obj1 = new DebitCard(1234567890123456l, "Dariush", "Debit");
        System.out.println(obj1.cardType);


        System.out.println("----------");
        DebitCard obj2 = new DebitCard(12345678, "Dariush", "Visa", 1234,100.00);
        System.out.println(obj2.cardType);


        System.out.println("----------");
        DebitCard obj3 = new DebitCard(12345678, "Dariush", "MaSter", 1234,100.00);
        System.out.println(obj3.cardType);



    }







}
