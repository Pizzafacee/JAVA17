package chapter28;

public class ThreadTest02 {
    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();

    }

}

class Thread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("副线程==>"+i);
        }
    }
}
