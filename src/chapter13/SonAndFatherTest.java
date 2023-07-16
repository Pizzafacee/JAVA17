package chapter13;

public class SonAndFatherTest {
    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();
        System.out.println(father.getInfo());
        System.out.println(son.getInfo());

        son.setInfo("大硅谷");
        System.out.println(father.getInfo());
        System.out.println(son.getInfo());
    }
}
