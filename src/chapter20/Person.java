package chapter20;

public abstract class Person extends Creature{
    @Override
    public void breath() {
        System.out.println("用鼻子呼吸");
    }
}
