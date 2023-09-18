package chapter35;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListStructure {
    @Test
    public void test1() {
        List<String> objects = new ArrayList<>();
        objects.add("3");
        objects.get(3);

        List<String> strings = new LinkedList<>();
        String s = strings.get(9);

        LinkedList<Object> objects1 = new LinkedList<>();

    }

}
