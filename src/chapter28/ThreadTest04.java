package chapter28;

public class ThreadTest04 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();

    }
}

class A extends Thread {
    @Override
    public void run() {
        System.out.println("A的多线程执行");
    }
}

class B extends Thread {
    A a;
    public B(A a){
        super(a);
    }
//    public void run() {
//        System.out.println("B的多线程执行");
//    }
}
