package chapter28;

public class DeadLockTest01 {
    private static StringBuffer s1 = new StringBuffer();
    private static StringBuffer s2 = new StringBuffer();

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                synchronized (s1) {
                    s1.append("1");
                    s2.append("a");
                    try {
                       Thread.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s2) {
                        s1.append("2");
                        s2.append("b");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                synchronized (s2) {
                    s1.append("a");
                    s2.append("1");
                    synchronized (s1) {
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();
    }


}


