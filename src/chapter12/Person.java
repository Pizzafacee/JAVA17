package chapter12;

public class Person {
    private String name;
    int age;

    public void eat(){
        System.out.println("吃饭");
        sleep();
    }

    private void sleep(){
        System.out.println("睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
