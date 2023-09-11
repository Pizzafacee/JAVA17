package chapter37;

public class Human<T> {
    @Colum(name = "name", type = "String")
    private String name;
    @Colum(name = "age", type = "int")
    private int age;
    T t;

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
