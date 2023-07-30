package chapter25;

import org.junit.Test;

public class AnnotationTest {
    @MyAnnotation(value = {"hello", "fake"})
    public void show() {
        System.out.println(3);
    }

    @MyAnnotation
    public void test() {
    }

    @Test
    public void test1(){

    }
}
