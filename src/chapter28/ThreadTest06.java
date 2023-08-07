package chapter28;

public class ThreadTest06 {
    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        window1.start();
        window2.start();

    }
}


class Window extends Thread {
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum >= 0) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "==>" + ticketNum);
                ticketNum--;
            } else break;
        }
    }
}
