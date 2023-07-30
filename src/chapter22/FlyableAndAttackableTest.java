package chapter22;

public class FlyableAndAttackableTest {
    public static void main(String[] args) {
        Attackable bullet = new Bullet(299, 233);
        bullet.attack();
        Flyble bullet1 = (Flyble) bullet;
        bullet1.fly();
    }
}
