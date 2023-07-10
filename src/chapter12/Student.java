package chapter12;

public class Student extends Person{
    private String school;

    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }
}
