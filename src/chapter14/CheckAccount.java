package chapter14;

public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(String id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }
}
