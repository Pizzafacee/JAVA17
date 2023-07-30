package chapter22;

public class Developer {
    private String name;
    private int age;

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void takeVehicle(Vehicle vehicle) {
        System.out.println(this.name+"每天通勤用车： ");
        vehicle.run();
        if (vehicle instanceof IPwoer) {
            IPwoer vehicle1 = (IPwoer) vehicle;
            vehicle1.power();
        }
    }
}
