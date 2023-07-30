package chapter24;

public class SeasonTest {
    public static void main(String[] args) {
        Season[] values = Season.values();
        String name = Season.SPRING.name();
        //Season season = Season.valueOf("COCO");
        int ordinal = Season.SPRING.ordinal();
    }
}
