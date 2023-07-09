package chapter11;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustom("布", "吕");
        bank.addCustom("羽", "关");

        Custom customer1 = bank.getCustomer(0);
        customer1.setAccount(new Account(1000.00));
        Custom customer2 = bank.getCustomer(1);
        customer2.setAccount(new Account(500.00));

        System.out.println(bank.getCustomer(0).getAccount().getBalance());
        customer1.getAccount().withdraw(1200);
        double balance = customer1.getAccount().getBalance();
        System.out.println(balance);
    }
}
