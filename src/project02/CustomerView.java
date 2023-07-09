package project02;

import java.util.Locale;

public class CustomerView {
    public static void main(String[] args) {
        CustomerLIst customerLIst = new CustomerLIst();
        while (true) {
            boolean flag = false;
            interfaceView();
            char c = CMUtility.readMenuSelection();
            switch (c) {
                case '1':
                    //添加客户
                    System.out.print("姓名：");
                    String name = CMUtility.readString(3);
                    System.out.print("性别：");
                    char gender = CMUtility.readChar();
                    System.out.print("年龄：");
                    int age = CMUtility.readInt();
                    System.out.print("电话；");
                    String phone = CMUtility.readString(11);
                    System.out.print("邮箱：");
                    String mail = CMUtility.readString(15);
                    Customer customer = new Customer(name, gender, age, phone, mail);
                    customerLIst.addCustomer(customer);
                    System.out.println("-----------添加客户成功-------------------");
                    break;
                case '2':
                    //修改客户
                    System.out.println("请输入要修改用户的编号:");
                    int index = CMUtility.readInt();
                    Customer customer1 = customerLIst.showCustomer(index);
                    if (customer1 != null) {
                        System.out.println("姓名" + "(" + customer1.getName() + "):");
                        String name1 = CMUtility.readString(4, "default");
                        System.out.println("性别" + "(" + customer1.getGender() + "):");
                        char gender1 = CMUtility.readChar('d');
                        System.out.println("年龄" + "(" + customer1.getAge() + "):");
                        int age1 = CMUtility.readInt(-1);
                        System.out.println("电话" + "(" + customer1.getPhone() + "):");
                        String phone1 = CMUtility.readString(11, "default");
                        System.out.println("邮箱" + "(" + customer1.getMail() + "):");
                        String mail2 = CMUtility.readString(15, "default");
                        customerLIst.modifyCustomer(index, name1, gender1, age1, phone1, mail2);
                        System.out.println("---------------------修改用户成功--------------------");
                    }
                    break;
                case '3':
                    //删除客户
                    System.out.println("请输入要删除用户的编号:");
                    int index1 = CMUtility.readInt();
                    Customer customer2 = customerLIst.showCustomer(index1);
                    System.out.println("该用户的信息是" + customer2.getName() + "\t"
                            + customer2.getGender() + "\n" + "确定要删除吗？(Y/N)");
                    char confirm = CMUtility.readConfirmSelection();
                    if (String.valueOf(confirm).toUpperCase(Locale.ROOT).equals("Y")) {
                        customerLIst.removeCustomer(index1);
                        System.out.println("------------删除用户成功-------------------");
                    }
                    break;
                case '4':
                    //客户列表
                    String list = customerLIst.showCustomerList();
                    System.out.println("------------客户列表----------------");
                    System.out.println(list);
                    System.out.println("------------客户列表完成---------------");
                    break;
                case '5':
                    //退出
                    flag = true;
                    break;
            }
            if (flag) {
                break;
            }
        }

    }

    public static void interfaceView() {
        System.out.println("---------------拼电商客户管理系统----------------");
        System.out.println("               1 添 加 客 户");
        System.out.println("               2 修 改 客 户");
        System.out.println("               3 删 除 客 户");
        System.out.println("               4 客 户 列 表");
        System.out.println("               5 退      出");
        System.out.println("\n");
        System.out.println("               请选择(1-5):");
    }
}
