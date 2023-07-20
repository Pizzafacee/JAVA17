package chapter16;

public class StaticTest {
    private static String name;

    {
        name = "zhangsan";
    }

    public String getStatic() {
        return name;
    }

    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        String aStatic = staticTest.getStatic();
        System.out.println(aStatic);
        System.out.println(StaticTest.name);
    }
}
