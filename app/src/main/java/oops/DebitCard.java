package oops;

public class DebitCard extends Card {

    public DebitCard(String name, Balance balance) {
        super(name, balance);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
    }
    
    
}
