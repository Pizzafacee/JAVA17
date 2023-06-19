package chapter03;

import java.util.Scanner;

//从键盘上输入2023年的月份和天数，要求计算当前是一年的多少天。
public class SwitchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入天数");
        int day = scanner.nextInt();
        //总计天数
        int days = 0;
        switch (month) {
            case 12:
                days+=30;
            case 11:
                days+=31;
            case 10:
                days+=30;
            case 9:
                days+=31;
            case 8:
                days+=31;
            case 7:
                days+=30;
            case 6:
                days+=31;
            case 5:
                days +=30;
            case 4:
                days+= 31;
            case 3:
                days+=28;
            case 2:
                days += 31;
            case 1:
                days += day;
                break;
        }
        scanner.close();
        System.out.println("今天是2023年的第"+days+"天");
    }
}
