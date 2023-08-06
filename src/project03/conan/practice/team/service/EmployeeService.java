package project03.conan.practice.team.service;

import project03.conan.practice.team.domain.Employee;
import project03.conan.practice.team.domain.Status;
import project03.conan.practice.team.exception.TeamException;

public class EmployeeService {
    public static int getEmployeeNum() {
        return employeeNum;
    }

    private static Employee[] employees = new Employee[11];
    private static int employeeNum;

    //获取所有的员工
    public static Employee[] getAllEmployee() {
        return employees;
    }

    //添加员工
    public static boolean addEmployee(Employee employee) throws TeamException {
        if (existDuplicateEmp(employee)) {
            throw new TeamException("该员工已经存在，请重新添加");
        }
        //先获取最后一个员工
        int teamNo = 1;
        if (employeeNum != 0) {
            Employee emp = employees[employeeNum - 1];
            teamNo = emp.getTeamNo() + 1;
        }
        employee.setTeamNo(teamNo);
        employees[employeeNum] = employee;
        employeeNum++;
        return true;
    }

    //根据teamNo删除员工
    public static void deleteEmployee(int teamNo) throws TeamException {
        int index = getIndexOfEmp(teamNo);
        if (index == -1) {
            throw new TeamException("该员工编号的员工不存在，请重新输入！");
        }
        for (int i = index; i < employeeNum - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[employeeNum - 1] = null;
        employeeNum--;
        int employeeId = employees[index].getId();
        //将BUSY状态改为FREE
        EmployeeMemberList.employees[employeeId-1].setStatue(Status.FREE);

    }


    //根据teamNo找到员工所在索引
    private static int getIndexOfEmp(int teamNo) {
        for (int i = 0; i < employeeNum; i++) {
            Employee employee = employees[i];
            if (employee.getTeamNo() == teamNo) return i;
        }
        return -1;
    }

    //遍历员工列表，查看是否有重复提交
    private static boolean existDuplicateEmp(Employee employee) {
        for (int i = 0; i < employeeNum; i++) {
            if (employees[i].getId() == employee.getId()) {
                return true;
            }
        }
        return false;
    }

}
