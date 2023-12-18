package entity.account;

import entity.Customer;
import entity.account.Account;

public class SavingsAccount extends Account {
    private final AccountType type = AccountType.SAVINGS_ACCOUNT;

    public SavingsAccount(Customer customer, double balance) {
        super(customer, balance);
    }

    public AccountType getType() {
        return type;
    }
}
