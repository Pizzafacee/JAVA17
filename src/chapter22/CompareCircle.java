package chapter22;

public class CompareCircle extends Circle implements CompareObject {
    public CompareCircle(double radius) {
        super(radius);
    }

    @Override
    public int compare(Object o) {
        if (o instanceof CompareCircle) {
            CompareCircle c = (CompareCircle) o;
            return getRadius() == c.getRadius() ? 0 : (getRadius() > c.getRadius() ? 1 : -1);
        } else {
            throw new ClassCastException("请传入正确的类型");
        }
    }
}
