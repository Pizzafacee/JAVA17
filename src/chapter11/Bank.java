package chapter11;

public class Bank {
    private Custom[] customs;
    private int numberOfCustoms;

    public Bank() {
        //初始化客户数组变量
        this.customs = new Custom[10];
    }


    //添加用户
    public void addCustom(String firstName, String lastName) {
        if (this.numberOfCustoms > customs.length) {
            System.out.println("对不起，用户数已满，请联系管理员");
        } else {
            Custom custom = new Custom(firstName, lastName);
            customs[numberOfCustoms] = custom;
            numberOfCustoms++;
        }
    }

    public int getNumberOfCustoms() {
        return this.numberOfCustoms;
    }

    //根据索引获取用户
    public Custom getCustomer(int index) {
        if (index >= this.numberOfCustoms || index < 0) {
            return null;
        }
        return this.customs[index];
    }
}
