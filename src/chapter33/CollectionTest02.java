package chapter33;

import chapter10.Student;
import org.junit.Test;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class CollectionTest02 {
    @Test
    public void test01() {
        Collection collection = new ArrayList();
        //增
        collection.add("a");
        collection.add("1");
        collection.add(3);
        collection.add(new Student("zhangsan", 32));

        Collection collection1 = new ArrayList();
        collection1.add("a");
        collection1.add(2);
        collection1.add(new Student("zhangsan", 32));

        //查
        boolean empty = collection.isEmpty();
        boolean contains = collection.contains(new Student("zhangsan", 32));//true
        boolean b = collection.containsAll(collection1);//true
        System.out.println(contains + "" + b);
        //删
        collection.clear();
        System.out.println(collection.size());
        collection.add("a");
        collection.add("1");
        collection.add(3);
        collection.add(new Student("zhangsan", 32));
        boolean b1 = collection.removeAll(collection1);
        System.out.println(collection);
        collection.add(new Student("zhangsan", 32));
        collection.add("a");
        boolean b2 = collection.retainAll(collection1);
        System.out.println(collection);
        boolean a = collection.remove("a");
        System.out.println(collection);
        collection.add("a");
        collection.add("1");
        collection.add(3);
        //数组和List相互转换
        Object[] objects = collection.toArray();
        List<Object> objects1 = Arrays.asList(objects);
        List<String> strings = Arrays.asList("a", "b", "c");
        Integer[] integers = new Integer[]{1, 2, 3};
        List<Integer> integers1 = Arrays.asList(integers);
        int size = integers1.size();//3
        int[] ints = new int[]{1, 2, 3};
        List<int[]> ints1 = Arrays.asList(ints);
        System.out.println(ints1.size());//1
    }

    @Test
    public void test2() {
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add(1);
        collection.add("b");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }

    @Test
    public void test3() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a", "1");
        linkedHashMap.put("b", "2");
        linkedHashMap.put("c", "3");
        linkedHashMap.put("d", "4");
        linkedHashMap.put("a", "9");
        linkedHashMap.put("wangk","dazedang");
        linkedHashMap.put("c", "7");
        linkedHashMap.put("d", "6");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    @Test
    public void test4(){
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("a","1");
        hashMap.put("b","2");
        hashMap.put("c","3");
        hashMap.put("wangk","dazedang");
        hashMap.put("d","4");
        hashMap.put("No2","lisi");
//        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//        Set<String> strings = hashMap.keySet();
//        for (String key: strings) {
//            String s = hashMap.get(key);
//            System.out.println(key + "=="+s);
//        }
        System.out.println(hashMap);
    }
}
