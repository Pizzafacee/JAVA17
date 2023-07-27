package chapter20;

public class Student extends Person{
    @Override
    public void eat() {
        System.out.println("学生很穷，吃不起饭");
    }
}
