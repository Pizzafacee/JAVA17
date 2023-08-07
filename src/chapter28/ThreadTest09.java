package chapter28;

public class ThreadTest09 {
    public static void main(String[] args) {
        Window4 window4 = new Window4();
        new Thread(window4).start();
        new Thread(window4).start();
    }
}

class Window4 implements Runnable {
    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticketNum > 0) {
                    try {
                        Thread.sleep(4);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "==>" + ticketNum);
                    ticketNum--;
                } else break;
            }
        }
    }


}
