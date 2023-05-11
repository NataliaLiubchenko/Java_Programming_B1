package day40_exception.bank;

public class Bank {
    double balance;
    public  void withdraw(double amountToWithdraw){
        if (amountToWithdraw>balance){
            throw new NotEnoughMoneyException();
        }
    }
    public  void login(String  username,String password) throws Exception{
        if (!username.equals("tomjerry")){
            throw  new InvalidCredantialException("Not valid username");
        }
        if (!password.equals("0000")){
            throw  new InvalidCredantialException("Not valid password");
        }

    }
}
