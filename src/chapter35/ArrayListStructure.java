package chapter35;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
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
        objects1.add(1);
        Object o = objects1.get(0);

        LinkedList link = new LinkedList();
        Object o1 = link.get(2);

        Object remove = link.remove();
        link.remove(1);
        link.add(null);
        link.add(null);

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(1, 2);

        objectObjectHashMap.get(1);


    }

}
