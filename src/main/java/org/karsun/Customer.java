package org.karsun;

public class Customer {

    private String name;
    private String address;
    private CreditCardInfo creditCard;

    public Customer() {

    }

    public Customer(String name, String address, CreditCardInfo creditCard) {
        super();
        this.name = name;
        this.address = address;
        this.creditCard = creditCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CreditCardInfo getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCardInfo creditCard) {
        this.creditCard = creditCard;
    }
    
}
