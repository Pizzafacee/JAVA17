package chapter28;

public class Customer extends Thread {
    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(100);
            System.out.println(Thread.currentThread().getName() + "==> " + account.getBalance());
        }

    }
}
