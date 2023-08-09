package chapter28;

public class ProducerAndConsumerTest03 {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        new Producer(clerk, "producer").start();
        new Consumer(clerk, "consumer1").start();
        new Consumer(clerk, "consumer2").start();
        new Consumer(clerk, "consumer3").start();
    }

}

class Producer extends Thread {
    public Producer(Clerk clerk, String name) {
        super(name);
        this.clerk = clerk;
    }

    private Clerk clerk;

    @Override
    public void run() {
        clerk.produce();
    }
}

class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk, String name) {
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        clerk.consume();
    }
}

class Clerk {
    private int products = 20;

    //制造商品的方法
    public void produce() {
        while (true) {
            synchronized (this) {
                notify();
                if (products < 20) {
                    products++;
                    System.out.println(Thread.currentThread().getName() + "现在制造的第" + products + "个商品");
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    //消费商品的方法
    public void consume() {
        while (true) {
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                notify();
                if (products > 0) {
                    System.out.println(Thread.currentThread().getName() + "现在消费的第" + products + "个商品");
                    products--;
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
