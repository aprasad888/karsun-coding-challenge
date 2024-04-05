package org.karsun;

public class CreditCardInfo {

    private String name;
    private String number;
    private String cvc;
    private String zip;
    private String expiryDate;

    public CreditCardInfo() {

    }

    public CreditCardInfo(String name, String number, String cvc, String zip, String expiryDate) {
        this.name = name;
        this.number = number;
        this.cvc = cvc;
        this.zip = zip;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getCvc() {
        return cvc;
    }

    public String getZip() {
        return zip;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    
}
