package chapter14;

public class Customer {
    private String name;
    private int age;
    private Account account;

    public Customer(String name, int age, Account account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    //取款的方法
    public void withdraw(double amount) {
        this.account.withdraw(amount);
    }

    @Override
    public String toString() {
        return "name\t" + name + "\t" + "age\t" + age + "\t" + "balance\t" + account.getBalance();
    }
}
