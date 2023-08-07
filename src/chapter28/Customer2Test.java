package chapter28;

public class Customer2Test {
    public static void main(String[] args) {
        Customer2 customer2 = new Customer2(new Account());
        new Thread(customer2).start();
        new Thread(customer2).start();
    }
}
