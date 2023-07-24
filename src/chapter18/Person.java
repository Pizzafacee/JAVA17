package chapter18;

public class Person {
    private String name;
    private int age;
    private long loginTime;



    public Person(int age) {
        this.age = age;
    }

    {
        name = System.currentTimeMillis() + "";
        loginTime = System.currentTimeMillis();
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
