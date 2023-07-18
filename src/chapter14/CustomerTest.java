package chapter14;

public class CustomerTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(
                "123",
                2999,
                0.045,
                1000);
        Customer customer = new Customer("李强", 22, checkAccount);
        customer.withdraw(3);
        System.out.println(customer.toString());
    }
}
