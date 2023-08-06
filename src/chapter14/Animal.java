package chapter14;

public class Animal {
    private String color;
    private int legs;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public Animal(String color, int legs) {
        this.color = color;
        this.legs = legs;
    }

    public void eat() {
        System.out.println("吃饭" + color);
    }

    public void jump() {
        System.out.println("跳高");
    }
}
