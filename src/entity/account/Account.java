package entity.account;

import entity.Customer;

abstract  public class Account {
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

    @Override
    public String toString() {
        return "Account number: " + this.getNumber() + "\nAccount Customer: " + this.customer.getName();
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public double withDraw(double value) {
        if (balance < value) {
            throw new Error("Insufficient funds");
        }

        balance -= value;

        return this.getBalance();
    }
}
