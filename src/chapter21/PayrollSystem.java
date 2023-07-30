package chapter21;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[1] = new SalariedEmployee(5000,"张三丰",2001,new MyDate(2012,12,11));
        employees[2] = new HourlyEmployee("李白",new MyDate(2021,12,14),2019,30,10);
    }
}
