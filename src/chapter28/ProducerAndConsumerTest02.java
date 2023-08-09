package chapter28;

public class ProducerAndConsumerTest02 {
    public static void main(String[] args) {
        Window6 window6 = new Window6();
        new Thread(window6).start();
        new Thread(window6).start();
    }
}

class Window6 implements Runnable {
    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (ticketNum > 0) {
                    System.out.println(Thread.currentThread().getName() + "==>" + ticketNum);
                    ticketNum--;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else break;
            }
        }
    }
}