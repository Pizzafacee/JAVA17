package chapter24;

//没有枚举类的时候 怎么创造枚举的
class A {
    public static void main(String[] args) {
        System.out.println(EnumTest.enum1.getMsg() + EnumTest.enum2.getMsg());
    }
}

public class EnumTest {

    private EnumTest(String msg, int num) {
        this.msg = msg;
        this.num = num;
    }


    private final String msg;
    private final int num;
    public static final EnumTest enum1 = new EnumTest("wu", 2);
    public static final EnumTest enum2 = new EnumTest("li", 1);

    public String getMsg() {
        return msg;
    }


    public int getNum() {
        return num;
    }


}
