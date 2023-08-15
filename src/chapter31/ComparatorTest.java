package chapter31;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

//comparator可以按照另一种规则排序，并可以创建多个comparator及多个排序规则
public class ComparatorTest {
    @Test
    public void test1() {
        Comparator<Student> comparator = new Comparator<>() {
            //按照身高 年龄 名字排序
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getHeight() != o2.getHeight()) return Double.compare(o1.getHeight(), o2.getHeight());
                else if (o1.getAge() != o2.getAge()) {
                    return Integer.compare(o1.getAge(), o2.getAge());
                } else return o1.getName().compareTo(o2.getName());
            }
        };

        Student s1 = new Student("wangkang", 12, 140.3);
        Student s2 = new Student("wangkang", 12, 150.2);
        Student s3 = new Student("wangkang", 13, 130.7);
        Student s4 = new Student("wangkang", 15, 150.6);
        Student s5 = new Student("zhangsan", 13, 135.7);
        Student s6 = new Student("lisi", 14, 135.7);
        Student s7 = new Student("lisi", 14, 140.8);
        Student[] students = new Student[]{s1, s2, s3, s4, s5, s6, s7};
        Arrays.sort(students,comparator);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
