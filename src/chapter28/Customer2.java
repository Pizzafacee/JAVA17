package chapter28;

public class Customer2 implements Runnable {
    private Account account;

    public Customer2(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(100);
            System.out.println(Thread.currentThread().getName() + "==>" + account.getBalance());
        }
    }
}
