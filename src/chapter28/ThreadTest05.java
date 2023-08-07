package chapter28;

import org.junit.Test;

public class ThreadTest05 {
    @Test
    public void test01() throws InterruptedException {
        MethodThread methodThread = new MethodThread();
        methodThread.setName("methodThread");
        methodThread.start();
        for (int i = 0; i < 100; i++) {
            Thread.yield();
            methodThread.join();
            System.out.println(Thread.currentThread().getName()+"=="+i);
        }
    }
}

class MethodThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i==20) this.setName("gagagagaga");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
    }
}
