package fr.cea.test;

public class Car {
    public Customer customer;

    public Car(){ }

    public Car(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
