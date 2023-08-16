package chapter33;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    @Test
    public void test1() {
        Set<Object> set = new HashSet<>();
        set.add("1");
        set.add("3");
        set.add("3");
        set.add(1);
        set.add(3);
        set.add(1);
    }

    @Test
    public void test2() {
        HashSet<Object> objects = new HashSet<>();
        while (true) {
            int i = (int) (Math.random() * (20 - 1 + 1) + 1);
            objects.add(i);
            if (objects.size() == 10) break;
        }
        for (Object o : objects) {
            System.out.println(o);
        }
    }
}
