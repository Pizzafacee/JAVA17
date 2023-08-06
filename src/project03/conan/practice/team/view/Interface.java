package project03.conan.practice.team.view;

import project03.conan.practice.team.domain.*;
import project03.conan.practice.team.exception.TeamException;
import project03.conan.practice.team.service.EmployeeMemberList;
import project03.conan.practice.team.service.EmployeeService;

public class Interface {
    public static void main(String[] args) {
        enterInterface();
    }

    private static void enterInterface() {
        boolean flag = true;
        do {
            System.out.println("============忧伤开发团队管理系统====================");
            System.out.println();
            System.out.println();
            System.out.println("id\t姓名\t年龄\t岗位\t状态\t薪资\t奖金\t股份\t办公设备");
            Employee[] employees = EmployeeMemberList.employees;
            for (Employee emp : employees) {
                int id = emp.getId();
                String name = emp.getName();
                int age = emp.getAge();
                String jobType = getJobType(emp);
                Status statue = emp.getStatue();
                double salary = emp.getSalary();
                String bonus = "";
                if (emp instanceof Designer) {
                    Designer designer = (Designer) emp;
                    bonus = String.valueOf(designer.getBonus());
                }
                String stock = "";
                if (emp instanceof Architect) {
                    Architect architect = (Architect) emp;
                    stock = architect.getStock();
                }
                String description = "";
                Equipments equipments = emp.getEquipments();
                if (equipments != null) {
                    description = equipments.getDescription();
                }
                System.out.println(id + "\t" + name + "\t" + age + "\t" + jobType + "\t" + statue + "\t" + salary + "\t" + bonus + "\t" + stock + "\t" + description);
            }
            System.out.println("请选择以下选项；\n1、显示团队列表\t2、增加团体成员\t3、删除团队成员\t4、退出系统");
            char c = TSUtility.readMenuSelection();
            switch (c) {
                case '1':
                    showEmployeeList();
                    TSUtility.readReturn();
                    break;
                case '2':
                    boolean insertFlag = false;
                    do {
                        try {
                            insertFlag = insertEmp();
                        } catch (TeamException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (!insertFlag);
                    System.out.println("新增成功！");
                    TSUtility.readReturn();
                    break;
                case '3':
                    boolean deleteFlag = false;
                    do {
                        try {
                            deleteFlag = removeEmp();
                        } catch (TeamException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (!deleteFlag);
                    System.out.println("删除成功！");
                    TSUtility.readReturn();
                    break;
                case '4':
                    System.out.println("确定要退出吗？(y/n)");
                    char c1 = TSUtility.readConfirmSelection();
                    if (c1 == 'Y') {
                        flag = false;
                    }
                    break;
            }

        } while (flag);
    }

    //删除员工
    private static boolean removeEmp() throws TeamException {
        System.out.println("请选择要删除的员工的teamNO");
        int teamNo = TSUtility.readInt();
        EmployeeService.deleteEmployee(teamNo);
        return true;
    }


    //增加员工
    //TODO 增加员工时防止员工重复增加   增加后需把员工状态改为BUSY
    private static boolean insertEmp() throws TeamException {
        System.out.println("请选择需要添加的员工id");
        int id = TSUtility.readInt();
        //根据id获取员工
        Employee employee = EmployeeMemberList.employees[id - 1];
        if (employee instanceof Programmer) {
            //写入员工信息
            boolean isAdd = EmployeeService.addEmployee(employee);
            employee.setStatue(Status.BUSY);
            return isAdd;
        } else {
            throw new TeamException("该员工没有岗位，请重新选择");
        }
    }

    private static void showEmployeeList() {
        System.out.println("id/teamNo\t姓名\t年龄\t岗位\t状态\t薪资\t奖金\t股份\t办公设备");
        Employee[] employee = EmployeeService.getAllEmployee();
        for (int i = 0; i < EmployeeService.getEmployeeNum(); i++) {
            Employee emp = employee[i];
            String jobType = getJobType(emp);
            String stock = "";
            if (emp instanceof Architect) {
                Architect architect = (Architect) emp;
                stock = architect.getStock();
            }
            String bonus = "";
            if (emp instanceof Designer) {
                Designer designer = (Designer) emp;
                bonus = String.valueOf(designer.getBonus());
            }
            String description = "";
            Equipments equipments = emp.getEquipments();
            if (equipments != null) {
                description = equipments.getDescription();
            }
            System.out.println(emp.getId() + "/" + emp.getTeamNo() + "\t" + emp.getName() + "\t" + emp.getAge() + "\t" + jobType + "\t" + emp.getStatue() + "\t" + bonus + "\t" + stock + "\t" + description);
        }
    }

    private static String getJobType(Employee emp) {
        if (emp instanceof Architect) {
            return "工程师";
        } else if (emp instanceof Designer) {
            return "设计师";
        } else if (emp instanceof Programmer) {
            return "程序员";
        }
        return "";
    }
}
