package fr.cea.test;

public class Customer {
    int age;
    double discount;
    boolean hasCar;

    public Customer() {
    }

    public Customer(int age ) {
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean getHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

}
