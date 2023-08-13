package chapter29;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class StringTest {
    @Test
    public void test01() {
        final int a = 3;
        final String b = "hello";
        String s1 = a + b;
        String b1 = "3hello";
        String s = 3 + "hello";
        System.out.println(s == b1);
        System.out.println(s1 == b1);
    }

    @Test
    public void test02() throws UnsupportedEncodingException {
        String s = "abc123中国";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        byte[] gbks = s.getBytes("gbk");
        for (int i = 0; i < gbks.length; i++) {
            System.out.println(gbks[i]);

        }
    }

    @Test
    public void test03(){
        String s = "祝福的位置是大熊星座";
        boolean contains = s.contains("祝福");
        int 大熊 = s.indexOf("大能");
        System.out.println(大熊);
    }
}
