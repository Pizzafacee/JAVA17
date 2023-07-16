package chapter13;

public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(String id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    //重写取款的方法
    @Override
    public boolean withdraw(double amount) {
        boolean flag = true;
        double balance = this.getBalance();
        if (amount <= balance) {
            //setBalance(balance -= amount);
            super.withdraw(amount);
        } else if (amount <= balance + overdraft) {
            this.overdraft -= (amount - balance);
            super.withdraw(amount);
        } else {
            System.out.println("信用额度不足");
            flag = false;
        }
        return flag;
    }
}
