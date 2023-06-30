package chaptertest;

public class Student {
    String name = "xingzhengjuan";
    int age = 10;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student() {
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
}
