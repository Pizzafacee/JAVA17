package chapter22;

public class EletricVehicle extends Vehicle implements IPwoer {
    public EletricVehicle(String brand, String color) {
        super(brand, color);
    }

    public void run() {
        System.out.println("电动车骑着不算快，但不用劲");
    }

    public void power(){
        System.out.println("电动车充电获得动力");
    }
}
