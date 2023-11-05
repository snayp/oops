package oops;

public abstract class Product {

    String name;
    Balance balance;

    public Product(String name, Balance balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName(){
        return this.name;
    };

    public void setName(String name){
        this.name = name;
    };

    public Balance getBalance(){
        return this.balance;
    }

}
