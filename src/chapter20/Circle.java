package chapter20;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    {
        radius = 3.3;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double findLong() {
        return Math.PI * 2 * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double area = circle.findArea();
        System.out.println(area + "   " + circle.radius);
    }
}
