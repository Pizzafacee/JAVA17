package chapter21;

public abstract class Employee {
    private String name;
    private MyDate birthday;
    private int number;

    public Employee(String name, MyDate birthday, int number) {
        this.name = name;
        this.birthday = birthday;
        this.number = number;
    }

    public Employee() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earning();

}
