package chaptertest;

public class Student {
    String name="xingzhenjuan" ;
    int age = 10;
    private Data data;

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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
