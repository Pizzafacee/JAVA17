package project03.conan.practice.team.domain;

public class Programmer extends Employee {
    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipments equipments) {
        super(id, name, age, salary, equipments);
    }

    @Override
    public String toString() {
        return super.toString() + "Programmer{}";
    }
}
