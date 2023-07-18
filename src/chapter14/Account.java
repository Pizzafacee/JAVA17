package chapter14;

public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account(String id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //取钱的
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("余额不足");
        } else {
            balance -= amount;
        }

    }
}
