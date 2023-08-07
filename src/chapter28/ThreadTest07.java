package chapter28;

public class ThreadTest07 {
    public static void main(String[] args) {
        Window2 window2 = new Window2();
        new Thread(window2).start();
        new Thread(window2).start();

    }
}

class Window2 implements Runnable {
    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum > 0) {
                System.out.println(Thread.currentThread().getName() + "==>" + ticketNum);
                ticketNum--;
            } else break;
        }
    }
}
