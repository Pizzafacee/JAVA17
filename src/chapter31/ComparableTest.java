package chapter31;

import org.junit.Test;

import java.util.Arrays;

public class ComparableTest {
    @Test
    public void test01() {
        Student s1 = new Student("wangkang", 12, 140.3);
        Student s2 = new Student("wangkang", 12, 150.2);
        Student s3 = new Student("wangkang", 13, 130.7);
        Student s4 = new Student("wangkang", 15, 150.6);
        Student s5 = new Student("zhangsan", 13, 135.7);
        Student s6 = new Student("lisi", 14, 135.7);
        Student s7 = new Student("lisi", 14, 140.8);
        Student[] students = new Student[]{s1, s2, s3, s4, s5, s6, s7};
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this == o) return 0;

        //按照名字 年龄 身高 进行排序
        if (name.equals(o.getName())) {
            if (age == o.getAge()) {
                return Double.compare(height, o.getHeight());
            } else {
                return Integer.compare(age, o.getAge());
            }
        } else {
            return name.compareTo(o.getName());
        }
    }
}
