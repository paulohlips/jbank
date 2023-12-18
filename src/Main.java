import entity.account.Account;
import entity.Customer;
import entity.account.CheckingAccount;
import entity.account.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("James Bond", "321654-1");
        CheckingAccount checkingAccount = new CheckingAccount(customer, 0.0);
        SavingsAccount savingsAccount = new SavingsAccount(customer, 0.0);

        checkingAccount.deposit(1000);
        checkingAccount.withDraw(999);
        System.out.println(checkingAccount.getBalance());
        System.out.println(checkingAccount.toString());
        System.out.println(checkingAccount.getType());

        savingsAccount.deposit(5000);
        savingsAccount.withDraw(1250);
        System.out.println(savingsAccount.getBalance());
        System.out.println(savingsAccount.toString());
        System.out.println(savingsAccount.getType());
    }
}