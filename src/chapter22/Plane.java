package chapter22;

public class Plane implements Flyble {
    private int speed;

    public void fly() {
        if (speed > Flyble.MAX_SPEED) {
            System.out.println("错误，超速了");
        } else if (speed < Flyble.MIN_SPEED) {
            System.out.println("速度不足，无法起飞");
        } else {
            System.out.println("该飞机能以" + speed + "的速度飞行");
        }
    }

    public Plane(int speed) {
        this.speed = speed;
    }
}
