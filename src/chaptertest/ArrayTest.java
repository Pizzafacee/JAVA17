package chaptertest;

import org.junit.Test;

public class ArrayTest {
    @Test
    public void test1() {
        Student[] students = new Student[1];
        students[0] = new Student("wangkang", 12);
        Student student = students[0];
        students[0] = new Student("zhangsan", 11);
        System.out.println(student);
        System.out.println(students[0]);

    }
}
