package chapter06;

import org.junit.Test;

//char的初始化为0
public class Test1 {
    char aChar;

    @Test
    public void test() {
        System.out.println(new Test1().aChar == 0);
    }
}
