package chapter34;

import org.junit.Test;

import java.util.Arrays;

public class Exer2Test {
    @Test
    public void test2() {
        String[] strings = {"a", "b", "c", "d", "e", "f"};
        Exer2.exchange(strings, 2, 4);
        for (String str :
                strings) {
            System.out.println(str);
        }
    }
}
