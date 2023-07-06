package chapter10;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        Account account = new Account("1000", 2000, 0.0123);
        customer.setAccount(account);
        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);
        String customerInfo = customer.getCustomerInfo();
        System.out.println(customerInfo);

    }
}
