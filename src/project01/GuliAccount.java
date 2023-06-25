package project01;

public class GuliAccount {
    public static void main(String[] args) {
        String detail = "收入支出\t\t收入/支出金额\t\t余额\t\t说明";
        int money = 10000;
        while (true) {
            boolean flag = false;
            //进入界面提示需要输入的指令
            interfaceEntrance();
            //读取键盘信息1-4，并做校验，使用一个工具方法
            int menuSelection = Utility.readMenuSelection();
            switch (menuSelection) {
                case 1:
                    //调用显示收支明细的方法
                    System.out.println(detail);
                    //printDetail();
                    break;
                case 2:
                    //调用登记收入的方法
                    int income = recordIncomeAndPay();
                    money += income;
                    String desc = recordDesc();
                    //修改收入支出的字符串
                    detail += "\n 收入\t\t" + income + "\t\t\t\t" + money+"\t"+desc;
                    break;
                //调用登记支出的方法
                case 3:
                    int pay = recordIncomeAndPay();
                    money -= pay;
                    String desc1 = recordDesc();
                    detail += "\n 支出\t\t" + pay + "\t\t\t\t" + money+"\t"+ desc1;
                    break;
                //调用退出的方法
                case 4:
                    System.out.println("确定退出？请输入Y/N");
                    String quick = Utility.quick();
                    if("Y".equals(quick)){
                        flag = true;
                    }
                    break;
            }
            if (flag) break;
        }

    }

    //初始化界面
    public static void interfaceEntrance() {
        System.out.println("==========谷粒记账软件=============\n\n\n");
        System.out.println("1 收支明细");
        System.out.println("2 登记收入");
        System.out.println("3 登记支出");
        System.out.println("4 退出\n\n");
        System.out.println("请选择（1-4）");
    }

    //显示支出明细的方法
    public static void printDetail() {
        System.out.println();

    }

    //登记收入和支出
    public static int recordIncomeAndPay() {
        System.out.println("请输入金额");
        //调用判断键盘输入支出和收入的数值的方法
        int num = Utility.readNum();
        return num;
    }

    //记录收入和支出说明
    public static String recordDesc() {
        System.out.println("请输入说明：");
        String desc = Utility.readString();
        return desc;
    }
}
