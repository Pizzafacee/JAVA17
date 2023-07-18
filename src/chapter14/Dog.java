package chapter14;

import java.util.stream.DoubleStream;

public class Dog extends Animal {
    public Dog(String color, int legs) {
        super(color, legs);
    }

    @Override
    public void eat() {
        System.out.println("狗爱吃狗粮");
    }

    @Override
    public void jump() {
        System.out.println("狗跳的高");
    }

    public void watchDoor() {
        System.out.println("狗会看门");
    }
}
