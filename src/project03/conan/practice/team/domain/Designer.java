package project03.conan.practice.team.domain;

public class Designer extends Employee {
    private double bonus;

    public Designer() {

    }

    public Designer(int id, String name, int age, double salary, double bonus,Equipments equipments) {
        super(id, name, age, salary,equipments);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "Designer{" +
                "bonus=" + bonus +
                '}';
    }
}
