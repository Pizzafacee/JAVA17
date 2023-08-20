package chapter34;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExerciseTest3 {
    @Test
    public void test() {
        String[] strings = {"a", "b", "c", "d", "e"};
        ExerciseTest3.reverse(strings);
        List<String> strings1 = Arrays.asList(strings);
        System.out.println(strings1);
    }

    public static <E> void reverse(E[] es) {
        for (int i = 0, j = es.length - 1; i < j; i++, j--) {
            E e = es[i];
            es[i] = es[j];
            es[j] = e;
        }
    }
}
