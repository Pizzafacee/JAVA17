package chapter28;


import java.util.concurrent.locks.ReentrantLock;
//有和synchronized类似的效果，是代码同步执行，但wait()和notify()方法不起作用
public class ConcurrentLockTest {
    public static void main(String[] args) {
        new ConcurrentThread().start();
        new ConcurrentThread().start();
    }
}

class ConcurrentThread extends Thread {
    private static int ticketNum = 100;
    private final static ReentrantLock REENTRANT_LOCK = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            REENTRANT_LOCK.lock();
            if (ticketNum > 0) {
                System.out.println(Thread.currentThread().getName() + "==>" + ticketNum);
                ticketNum--;
            } else break;
            REENTRANT_LOCK.unlock();
        }
    }
}
