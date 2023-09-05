package chaptertest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayTest {
    @Test
    public void test1() {
        Student[] students = new Student[1];
        students[0] = new Student("wangkang", 12);
        Student student = students[0];
        students[0] = new Student("zhangsan", 11);
        System.out.println(student);
        System.out.println(students[0]);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        ArrayList<Object> objects = new ArrayList<>();
        Iterator<Object> iterator = objects.iterator();
        Object next = iterator.next();

    }
}
