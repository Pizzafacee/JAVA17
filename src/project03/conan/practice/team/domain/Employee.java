package project03.conan.practice.team.domain;

public class Employee {
    private int id;
    private int teamNo;
    private String name;
    private int age;
    private double salary;
    private Status statue = Status.FREE;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatue() {
        return statue;
    }

    public void setStatue(Status statue) {
        this.statue = statue;
    }

    private Equipments equipments;

    public Employee() {
    }

    public Equipments getEquipments() {
        return equipments;
    }

    public void setEquipments(Equipments equipments) {
        this.equipments = equipments;
    }

    public Employee(int id,  String name, int age, double salary, Equipments equipments) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.equipments = equipments;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "teamNo=" + teamNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
