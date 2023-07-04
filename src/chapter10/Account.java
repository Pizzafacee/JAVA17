package chapter10;

public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account() {

    }

    public Account(String id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
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

    //取款
    public void withdraw(double money) {
        if (this.balance - money < 0) {
            System.out.println("余额不足");
        } else {
            balance -= money;
        }
    }

    //存款
    public void deposit(double money) {
        balance += money;
    }
}
