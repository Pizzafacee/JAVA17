package chapter28;

public class ThreadTest08 {
    public static void main(String[] args) {
        new Window3().start();
        new Window3().start();
    }
}

class Window3 extends Thread {
    private static int ticketNum=100;

    @Override
    public void run() {
        while (true){
            synchronized(Window3.class){
                if(ticketNum>0){
                    try {
                        Thread.sleep(6);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"==>"+ticketNum);
                    ticketNum--;
                }else break;
            }

        }
    }
}
