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

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);

    }
}
