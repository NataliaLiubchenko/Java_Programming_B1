package day40_exception.bank;

public class NotEnoughMoneyException extends RuntimeException{
    //This is unchecked/runtime exception since it inherits RuntimeException
    public NotEnoughMoneyException(){
        super("Not Enough Money");
    }
    public NotEnoughMoneyException(String  msg){
        super(msg);
    }

}
