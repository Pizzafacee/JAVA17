package chapter28;

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread2 thread2 = new Thread2();
        new Thread(thread2).start();
        //再创建一个线程
        new Thread(thread2).start();
        Thread.sleep(1000);
        System.out.println(thread2.getMoney());
    }

}

class Thread2 implements Runnable {
    private int money = 100;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("副线程==>" + i);
        }
        money++;
    }

    public int getMoney() {
        return money;
    }
}
