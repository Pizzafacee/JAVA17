package chapter17;

public class Bank2 {
    private Bank2() {
    }

    private static Bank2 bank2 = null;

    public static Bank2 getInstance() {
        synchronized (Bank2.class){
            if (bank2 == null) {
                bank2 = new Bank2();
            }
            return bank2;
        }

    }
}
