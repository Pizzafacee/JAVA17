package chapter12;

public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        super();
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //计算圆柱体积
    public double findVolume() {
        return findArea() * length;
    }
}
