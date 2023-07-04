package chapter10;

public class Student {
    private String name;
    private int age;
    private String school;
    private String major;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Student(String name, int age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return this.school;
    }

    public String getMajor() {
        return this.major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
