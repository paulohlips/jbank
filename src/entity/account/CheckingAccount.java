package entity.account;

import entity.Customer;

public class CheckingAccount extends Account {
    private final AccountType type = AccountType.CHECKING_ACCOUNT;

    public CheckingAccount(Customer customer, double balance) {
        super(customer, balance);
    }

    public AccountType getType() {
        return type;
    }
}
