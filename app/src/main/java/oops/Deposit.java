package oops;

public class Deposit extends Product{

    public Deposit(String name, Balance balance) {
        super(name, balance);
    }

    public static void closeDeposit(Deposit deposit){
        deposit = null;
    }
    
}
