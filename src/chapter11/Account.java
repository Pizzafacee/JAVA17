package chapter11;

public class Account {
    private double balance;//余额

    public Account() {
    }

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    //取款
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("取款成功，共取出" + amount + "元");
        } else {
            System.out.println("余额不足");
        }
    }

    //存款
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存款成功，共存入" + amount + "元");
        }

    }
}
