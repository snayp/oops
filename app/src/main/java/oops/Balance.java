package oops;

public class Balance {
    private double amount;
    private String currency;

    public Balance(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    String getCurrency(){
        return this.currency;
    }

    void setCurrency(String currancy){
        this.currency = currancy;
    }

    void increaseAmount(Balance balance){
        if (balance.currency == this.currency) {
            this.amount += this.getAmount()+balance.amount;
            setAmount(this.amount);
        }
        else {
            System.out.println("Валюта пополения не совпадает с валютой продукта");
        }
            
    };
    
    boolean decreaseAmount(Balance balance){
        if (this.currency == balance.currency) {
            if (this.getAmount()>balance.amount) {
                this.amount += this.getAmount()-balance.amount;
                this.setAmount(this.amount);
                return true;
            } else {
                System.out.println("Не хватает средств!");
                return false;
            }
        } else {
            System.out.println("Валюта пополнения не совпадает с валютой карты!");
            return false;
        }
        
    };

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
