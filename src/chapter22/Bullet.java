package chapter22;

public class Bullet implements Flyble, Attackable {
    private int speed;
    private double damage;

    @Override
    public void attack() {
        if (damage > Attackable.MAX_DAMAGE) {
            System.out.println("子弹威力太大");
        } else if (damage < Attackable.MIN_DAMAGE) {
            System.out.println("子弹为例太小，不合格");
        } else {
            System.out.println("子弹能造成" + damage + "点伤害");
        }
    }

    public Bullet(int speed, double damage) {
        this.speed = speed;
        this.damage = damage;
    }

    @Override
    public void fly() {
        System.out.println("子弹能以" + speed + "的速度飞行");
    }
}
