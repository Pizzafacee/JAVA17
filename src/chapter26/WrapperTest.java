package chapter26;

import org.junit.Test;

public class WrapperTest {

    @Test
    public void test1() {
        Integer integer = Integer.valueOf(3);
        Integer integer1 = new Integer(3);
        int i = integer.intValue();
        Integer integer2 = 3;
        int i1 = 3;
        int i2 = Integer.parseInt("222");

        Integer a = 3;
        Integer b = 3;
        System.out.println(a==b);

        String s1 = String.valueOf(3);
        String s11 = s1;
        String s111 = s11;
        String s1111 = s111;
        String s11111 = s1111;
        String s111111 = s11111;
        String s = s111111;
    }
}
