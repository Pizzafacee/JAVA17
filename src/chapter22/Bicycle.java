package chapter22;

public class Bicycle extends Vehicle {
    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    public void run() {
        System.out.println("自行车骑着很慢");
    }
}
