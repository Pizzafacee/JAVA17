package chapter28;

public class SingletonTest {
    public static void main(String[] args) throws InterruptedException {
        Singleton instance = Singleton.getInstance();
        new Thread() {
            @Override
            public void run() {
                Singleton instance1 = Singleton.getInstance();
                System.out.println(instance1 + "&&" + instance);
                System.out.println(instance1 == instance);
                System.out.println(instance1.getName());
            }
        }.start();
        Thread.sleep(39);
        instance.setName("SSSS");
        System.out.println(instance.getName());
    }
}
