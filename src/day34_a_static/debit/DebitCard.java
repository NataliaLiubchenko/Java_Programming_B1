package day34_a_static.debit;

public class DebitCard {
    //data: card number, holderName, cardType, pin, balance

    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;
    //have a data of accaunt type theat is the same for all users

    static  String accountType;

    static {
        System.out.println("Static block is running");
        accountType = "Checking";
    }
    //create a constructor that accepts three arg: cardNumb, holdName, balance
    public DebitCard(long cardNumber, String holderName,String cardType){
        if ((cardNumber+"").length()==16) { //String.valueOf(cardNumber).lenggth()==16
            this.cardNumber = cardNumber;
        }else {
            System.out.println("The length is not correct");
        }
        this.holderName = holderName;
        if (cardType.equalsIgnoreCase("Master")){
            this.cardType = cardType;
        }else {
            System.out.println("Invalid card type");
        }


    }

    //create a constructor that accepts 5 arg: cardNumb, holdName, balance, pin, cardType
    // assign if length of pin is 4
    // assign if cardType is ONLY master/MASTER/Master
    public DebitCard(long cardNumber, String holderName,String cardType, int pin, double balance){
        this( cardNumber,  holderName, cardType);
        if ((pin+"").length()==4){
            this.pin =pin;
        }else {
            System.out.println("Invalid pin");
        }
        if (cardType.equalsIgnoreCase("MasterCard")){

        }


    }

}
