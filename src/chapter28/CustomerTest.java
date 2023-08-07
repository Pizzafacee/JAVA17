package chapter28;

public class CustomerTest {
    public static void main(String[] args) {
        Account account = new Account();
        new Customer(account).start();
        new Customer(account).start();
    }
}
