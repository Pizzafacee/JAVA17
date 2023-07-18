package chapter14;

public class Cat extends Animal {
    public Cat(String color, int legs) {
        super(color, legs);
    }

    @Override
    public void eat() {
        System.out.println("猫爱吃猫粮");
    }

    @Override
    public void jump() {
        System.out.println("猫跳得很灵活");
    }

    public void catchMouse(){
        System.out.println("猫会抓老鼠");
    }
}
