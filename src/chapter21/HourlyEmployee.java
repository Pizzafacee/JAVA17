package chapter21;

public class HourlyEmployee extends Employee {
    private double wage;//单位小时的工资
    private int hour;//月工作小时数

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, MyDate birthday, int number, double wage, int hour) {
        super(name, birthday, number);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double earning() {
        return wage * hour;
    }
}
