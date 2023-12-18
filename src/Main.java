import entity.Account;
import entity.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("James Bond", "321654-1");
        Account account = new Account(customer, 0.0);

        account.deposit(1000);
        System.out.println(account.getBalance());
        account.withDraw(999);
        System.out.println(account.getBalance());

        System.out.println(account.toString());
    }
}