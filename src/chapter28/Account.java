package chapter28;

public class Account {
    private double balance = 10000;

    public Account() {
    }

    public double getBalance() {
        return balance;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (balance >= amount) {
            balance -= amount;
        }
    }
}
