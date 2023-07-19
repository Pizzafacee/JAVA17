package chapter14;

public class SubTest {
    public static void main(String[] args) {
        Sub sub = new Sub();
        Base base = new Sub();
        System.out.println(sub.count);
        System.out.println(base.count);
        sub.display();
        base.display();
    }
}
