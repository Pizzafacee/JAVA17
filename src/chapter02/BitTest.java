package chapter02;

//位运算符
public class BitTest {
    //交换两个int型变量的值；
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "," + b);

        int i = 2 << 3;

        System.out.println(i);
    }
}
