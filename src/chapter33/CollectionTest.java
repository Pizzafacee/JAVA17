package chapter33;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    @Test
    public void test01() {
        Collection collection = new ArrayList();
        Collection collection2 = new ArrayList();
        Collection set = new HashSet<>();
        collection.add(1);
        collection.add(2);
        collection2.add("aa");
        collection2.add("33");
        collection.addAll(collection2);
        collection.contains("a");
        boolean b = collection.containsAll(collection2);
        Integer[] integers = new Integer[0];
        ArrayList<Object> objects = new ArrayList<>();
        System.out.println(objects);
        System.out.println(objects.size());
    }
}
