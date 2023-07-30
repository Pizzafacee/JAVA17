package chapter23;

public class Inner {

    public static void main(String[] args) {
        Person.Dog dog = new Person.Dog();
        //Person.Cat cat = new Person.Cat();
        Person person = new Person();
        Person.Cat cat = person.new Cat();
    }


}

class Person {
    String name = "tom";
    int age = 3;

    public void eat() {
    }

    //静态成员内部类
    static class Dog {

    }

    //非静态成员内部类
    class Cat {
        String name = "蜂鸟";
        int age = 2;

        public void eat() {
        }

        public void show(String name) {
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);

            Person.this.eat();
            this.eat();
        }


    }

    public void method() {
        //非匿名局部内部类
        class Bird {
        }
    }

    {
        //非匿名局部内部类
        class Bird {

        }

        //匿名局部内部类
        new Fly() {
        };
    }
}
