package chapter28;

public class ThreadTest01 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread3 thread3 = new Thread3();
        thread3.start();
        thread1.start();
        try {
            for (int i = 0; i < 100; i++) {
                if (i == 40) {
                    Thread.sleep(1000);
                }
                System.out.println("主线程执行==>" + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println("副线程执行==>" + i);
        }
    }
}

class Thread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
    }
}
