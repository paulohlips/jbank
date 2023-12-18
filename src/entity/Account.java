package entity;

public class Account {
    private int number;
    private double balance;
    private Customer customer;

    public Account(Customer customer, double balance) {
        this.number = (int) (Math.random() * 100000);
        this.balance = balance;
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getNumber() {
        return number;
    }
}
