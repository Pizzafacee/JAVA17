package project01;

import java.util.Locale;
import java.util.Scanner;

//从键盘读取信息的工具
public class Utility {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * 从键盘读取1-4的信息，如果输入的不是这个，就提示“输入错误，请重新输入”
     *
     * @return
     */
    public static int readMenuSelection() {
        while (true) {
            String menuCode = readKeyboard(1);
            if (!menuCode.equals("1") && !menuCode.equals("2") && !menuCode.equals("3") && !menuCode.equals("4")) {
                System.out.println("输入错误，请重新输入");
            } else {
                return Integer.parseInt(menuCode);
            }
        }
    }

    /**
     * 从键盘读取收入和支出，长度不超过4位整数
     *
     * @return
     */

    public static int readNum() {
        int num = 0;
        while (true) {
            try {
                String str = readKeyboard(4);
                num = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.out.println("输入的格式错误，请重新输入");
            }
        }
        return num;
    }


    /**
     * 从键盘读取收支明细的方法
     *
     * @return
     */
    public static String readString() {
        String str = readKeyboard(20);
        return str;
    }


    public static String readKeyboard(int limit) {
        String next = scanner.next();
       // scanner.close();
        return next;
    }

    //退出的方法
    public static String quick() {
        String s = readKeyboard(1);
        String s1 = s.toUpperCase(Locale.ROOT);
        return s1;
    }
}
