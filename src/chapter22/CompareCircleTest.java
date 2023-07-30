package chapter22;

public class CompareCircleTest {
    public static void main(String[] args) {
        CompareCircle compareCircle = new CompareCircle(2.33);
        CompareCircle compareCircle1 = new CompareCircle(3.222);
        int compare = compareCircle.compare(compareCircle1);
        System.out.println(compare);
    }
}
