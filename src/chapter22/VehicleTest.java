package chapter22;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("凤凰", "红");
        vehicles[1] = new EletricVehicle("雅迪", "绿");
        vehicles[2] = new Car("苏A12154", "奥迪", "黑");


        Developer developer = new Developer("章节为", 22);
        developer.takeVehicle(vehicles[1]);
    }
}
