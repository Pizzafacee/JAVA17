package chapter18;

public class HelloA {
    public HelloA() {
        System.out.println("HelloA");
    }

    {
        System.out.println("IM a CLASS");
    }

    static {
        System.out.println("static A");
    }
}

class HelloB extends HelloA {
    public HelloB() {
        System.out.println("HelloB");
    }

    {
        System.out.println("im B class");
    }

    static {
        System.out.println("static B");
    }
}