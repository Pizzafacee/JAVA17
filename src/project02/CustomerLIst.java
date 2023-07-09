package project02;

import chapter11.Custom;

public class CustomerLIst {
    private Customer[] customers;
    private int numOfCustomers;

    public int getNumOfCustomers() {
        return numOfCustomers;
    }

    public void setNumOfCustomers(int numOfCustomers) {
        this.numOfCustomers = numOfCustomers;
    }

    public CustomerLIst() {
        customers = new Customer[10];
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    //添加客户
    public void addCustomer(Customer customer) {
        if (numOfCustomers > customers.length) {
            System.out.println("对不起，客户数已满");
        } else {
            customers[numOfCustomers] = customer;
            numOfCustomers++;
            System.out.println("添加客户成功");
        }
    }

    //修改客户
    public void modifyCustomer(int index, String name, char gender, int age, String phone, String mail) {
        if (index > numOfCustomers || index < 1) {
            System.out.println("找不到指定用户");
        } else {
            Customer customer = customers[index - 1];
            customer.setName((name.equals("default") ? customer.getName() : name));
            customer.setGender(gender == 'd' ? customer.getGender() : gender);
            customer.setAge(age == -1 ? customer.getAge() : age);
            customer.setPhone(phone.equals("default") ? customer.getPhone() : phone);
            customer.setMail(mail.equals("default") ? customer.getMail() : mail);
            System.out.println("修改客户成功");
        }
    }

    //删除客户
    public void removeCustomer(int index) {
        if (index > numOfCustomers || index < 1) {
            System.out.println("找不到指定用户");
        } else {
            for (int i = index - 1; i < numOfCustomers - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[numOfCustomers - 1] = null;
            numOfCustomers--;
            System.out.println("客户删除成功");
        }
    }

    //显示客户列表
    public String showCustomerList() {
        String list = "编号\t姓名\t性别\t年龄\t电话\t\t邮箱\n";
        if (numOfCustomers == 0) {
            return "";
        } else {
            for (int i = 0; i < numOfCustomers; i++) {
                list += i + 1 + "\t"
                        + customers[i].getName() + "\t"
                        + customers[i].getGender() + "\t"
                        + customers[i].getAge() + "\t"
                        + customers[i].getPhone() + "\t\t"
                        + customers[i].getMail() + "\n";
            }
            return list;
        }

    }

    //显示单个用户
    public Customer showCustomer(int index) {
        if (index > numOfCustomers || index < 1) {
            System.out.println("找不到指定用户");
            return null;
        }
        return customers[index - 1];
    }
}

