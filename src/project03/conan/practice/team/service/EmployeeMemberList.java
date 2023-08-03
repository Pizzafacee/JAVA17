package project03.conan.practice.team.service;

import project03.conan.practice.team.domain.*;

public class EmployeeMemberList {
    public static Employee[] employees;

    static {
        employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            String employee = Data.EMPLOYEES[i][0];
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            switch (Integer.parseInt(employee)) {
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary, getEquipmentForEmployee(i));
                    break;
                case Data.PROGRAMMER:
                    employees[i] = new Programmer(id, name, age, salary, getEquipmentForEmployee(i));
                    break;
                case Data.DESIGNER:
                    employees[i] = new Designer(id, name, age, salary, Double.parseDouble(Data.EMPLOYEES[i][5]), getEquipmentForEmployee(i));
                    break;
                case Data.ARCHITECT:
                    employees[i] = new Architect(id, name, age, salary, Double.parseDouble(Data.EMPLOYEES[i][5]), Data.EMPLOYEES[i][6], getEquipmentForEmployee(i));
                    break;
            }

        }
    }


    //根据索引，为每个员工配备设备
    private static Equipments getEquipmentForEmployee(int i) {
        if (i == 0) {
            return null;
        }
        int type = Integer.parseInt(Data.EQUIPMENTS[i][0]);
        String bandName = Data.EQUIPMENTS[i][1];
        String model = Data.EQUIPMENTS[i][2];
        switch (type) {
            case Data.PC:
                return new PC(bandName, model);
            case Data.NOTEBOOK:
                return new NoteBook(bandName, model);
            case Data.PRINTER:
                return new Printer(bandName, model);
            default:
                return null;
        }
    }
}
