package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
        double giftCard = 300;
               String item1 ="Dior",
                item2 = "Channel";
        System.out.println("I have $ "+giftCard+" worth of gift card.");
        giftCard-=50;
        System.out.println("after buying "+item1+", I have left "+giftCard+" amount in gift card");

        giftCard-=100;
        System.out.println("after buying "+item2+", I have left "+giftCard+" amount in gift card");

        giftCard*=2;
        System.out.println("now i have a new balance of $ "+giftCard);


    }
}
