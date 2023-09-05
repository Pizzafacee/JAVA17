package chaptertest;

import org.junit.Test;

public class OverloadTest {
    @Test
    public void test() {
        method(2, "s", "3");
        method(3);
        method(Integer.valueOf(3));
    }

    public void method(int a, String... strings) {
        System.out.println("Strings");
    }

    public void method(int a) {
        System.out.println("int");
    }

    public void method(Integer a) {
        System.out.println("Integer");
    }
}
