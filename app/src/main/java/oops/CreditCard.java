package oops;

public class CreditCard extends Card {

    private double rate;
    private double debt;

    public CreditCard(String name, Balance balance, double rate, double debt) {
        super(name, balance);
        this.rate = rate;
        this.debt = debt;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    public double getDebt(){
        return this.debt;
    }
}
