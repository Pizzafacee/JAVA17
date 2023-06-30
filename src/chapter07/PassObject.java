package chapter07;

public class PassObject {

    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        Circle circle = new Circle();
        passObject.printAreas(circle, 5);
        System.out.println(circle.radius);
    }

    public void printAreas(Circle circle, int times) {
        int j =2;
        for (int i = 1; i <= times; i++) {
            double area = circle.findArea(i);
            System.out.println("圆的面积是" + area);
        }
    }
}
