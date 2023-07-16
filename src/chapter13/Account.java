package chapter13;

public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account(String id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public Account() {
    }

    public double getBalance() {
        return balance;
    }

//    //public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //取款
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        System.out.println("余额不足");
        return false;
    }

    //返回月利率
    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    //存款
    public boolean deposit(double amount) {
        balance += amount;
        return true;
    }
}
