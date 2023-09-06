package chapter16;

public class StaticTest {
    private static String name;
    public final static String INTEREST;

    static {
        INTEREST = "football";
    }

    {
        name = "zhangsan";
    }

    public String getStatic() {
        return name;
    }

    public static void main(String[] args) {
        new StaticTest();
        System.out.println(StaticTest.name);
    }
}
