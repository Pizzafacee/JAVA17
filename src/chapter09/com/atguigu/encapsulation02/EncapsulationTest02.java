package chapter09.com.atguigu.encapsulation02;

public class EncapsulationTest02 {
    public static void main(String[] args) {
        Animal04 animal04 = new Animal04();
        animal04.eat();//protected在继承的方法中可以挎包使用
    }
}
