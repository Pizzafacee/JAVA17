package chapter17;

public class Bank {
    //私有化构造器
    private Bank() {
    }

    //在类中声明本类的属性
    private static Bank bank = new Bank();

    public static Bank getInstance() {
        return bank;
    }
}
