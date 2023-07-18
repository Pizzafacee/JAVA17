package chapter14;

public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(String id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else if (amount <= getBalance() + overdraft) {
            overdraft -= amount - getBalance();
            super.withdraw(getBalance());
        } else {
            System.out.println("信用额度不足");
        }
    }
}
