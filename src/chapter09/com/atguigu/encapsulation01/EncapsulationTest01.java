package chapter09.com.atguigu.encapsulation01;

//import chapter09.com.atguigu.encapsulation02.Animal02;

import chapter09.com.atguigu.encapsulation02.Animal03;

public class EncapsulationTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "龙鬼";
        animal.legs = 3;
        animal.eat();

        //Animal02 animal02 = new Animal02() 缺省 不能跨包访问

        Animal03 animal03 = new Animal03();
       // animal03.eat(); protected 不是继承关系 无法挎包访问


    }
}

