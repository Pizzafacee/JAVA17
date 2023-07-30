package chapter22;

public class Car extends Vehicle implements IPwoer {
    private String carNumber;

    public Car(String carNumber, String brand, String color) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    @Override
    public void power() {
        System.out.println("汽车加油提供动力");
    }

    @Override
    public void run() {
        System.out.println("汽车跑起来飞快");
    }
}
