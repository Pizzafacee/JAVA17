package chapter07;

public class Circle {
    double radius;

    public double findArea(int radius) {
        this.radius = radius;
        return Math.PI * this.radius * this.radius;
    }
}
