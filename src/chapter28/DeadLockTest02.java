package chapter28;

public class DeadLockTest02 implements Runnable {
    DeadLockOne deadLockOne = new DeadLockOne();
    DeadLockTwo deadLockTwo = new DeadLockTwo();

    public void init() {
        Thread.currentThread().setName("主线程");
        deadLockOne.foo(deadLockTwo);
        System.out.println("进入了主线程之后");
    }

    @Override
    public void run() {
        Thread.currentThread().setName("副线程");
        deadLockTwo.bar(deadLockOne);
        System.out.println("进入了副线程之后");
    }

    public static void main(String[] args) {
        DeadLockTest02 deadLockTest02 = new DeadLockTest02();
        new Thread(deadLockTest02).start();
        deadLockTest02.init();
    }
}

class DeadLockOne {
    public synchronized void foo(DeadLockTwo deadLockTwo) {
        System.out.println("当前线程" + Thread.currentThread().getName() + "进入了One实例的foo方法");

        System.out.println("当前线程" + Thread.currentThread().getName() + "准备执行Two实例的last方法");
        deadLockTwo.last();
    }

    public synchronized void last() {
        System.out.println("进入了One实例的last方法");
    }
}

class DeadLockTwo {

    public synchronized void bar(DeadLockOne deadLockOne) {
        System.out.println("当前线程" + Thread.currentThread().getName() + "进入了Two实例的bar方法");

        System.out.println("当前线程" + Thread.currentThread().getName() + "准备执行One实例的last方法");

        deadLockOne.last();
    }

    public synchronized void last() {
        System.out.println("进入了Two实例的last方法");
    }
}
