package chapter33;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    @Test
    public void test2() {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("a", 2);
        objectObjectHashMap.put("1", null);
        objectObjectHashMap.put(null, 2);
        System.out.println(objectObjectHashMap.get(null));
        HashMap<Object, Object> objectObjectHashMap2 = new HashMap<>();
        //Set<Map.Entry<Object, Object>> entries = objectObjectHashMap2.entrySet();
        objectObjectHashMap2.put(3, 3);
        objectObjectHashMap2.put(4, "1");
        objectObjectHashMap.putAll(objectObjectHashMap2);
        System.out.println(objectObjectHashMap);

        //Object remove = objectObjectHashMap2.remove(3);
        boolean replace = objectObjectHashMap2.replace(3, 3, 8);
        System.out.println(objectObjectHashMap2);
    }
}
