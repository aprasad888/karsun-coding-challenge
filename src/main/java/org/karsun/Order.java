package org.karsun;

public class Order {

    private Double total;
    private Item item;
    private Customer customer;

    public Order() {

    }

    public Order(Double total, Item item, Customer customer) {
        this.total = total;
        this.item = item;
        this.customer = customer;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    } 
    
}
