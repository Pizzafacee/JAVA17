package chapter28;

public class ProducerAndConsumerTest01 {
    public static void main(String[] args) {
        new Window5().start();
        new Window5().start();
    }
}

class Window5 extends Thread {
    private static int ticketNum = 100;
    private static Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                object.notify();
                if (ticketNum > 0) {
                    System.out.println(Thread.currentThread().getName() + "==>" + ticketNum);
                    ticketNum--;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else break;
            }
        }

    }
}
